
# ILGV2 client library
Get an organisation identity thanks to ilgV2 rest api

## Compatibility

This library requires library requires Java version 1.8 or higher.
This library is compatible with ilg rest api 2.0.8

## Installation (Maven)

Add the following in your `pom.xml`

``` xml
    <dependencies>
        <dependency>
          <groupId>fr.redfroggy</groupId>
          <artifactId>ilg-spring-boot-starter</artifactId>
          <version>1.1.0</version>
        </dependency>
    </dependencies>
```

## Project structure
Client's code must be located under the "fr.redfroggy.ilg.*" package

## Usage

The clients relies on service using [IlgRestTemplate](src/main/java/fr/redfroggy/ilg/spring/boot/autoconfigure/IlgRestTemplate.java).
All clients implements [IlgApi](src/main/java/fr/redfroggy/ilg/client/IlgApi.java), see [SiteApi](src/main/java/fr/redfroggy/ilg/client/site/SiteApi.java).
So you have to inject the client services to be able to use it:


### site api
```java
//...
@Autowired
private SiteApi siteApi;

//...
public SitesProjection getCompanySites(String country, String registrationId) {

    SiteRequest requestParams = SiteRequest.builder()
        .page(PageRequest.of(0,2))
        .build();
    
    ResponseEntity<SitesProjection> sitesResponse = apiClient.getSites(country, registrationId, requestParams);
    return sitesResponse.getBody();
}

public SiteProjection getCompanySite(String country, String registrationId, String siteId) {

  ResponseEntity<SiteProjection> siteResponse = apiClient.getSite(country, registrationId, siteId);
  return siteResponse.getBody();
}
```

### company api
```java
//...
@Autowired
private CompanyApi apiClient;

//...
public Availability getAvailability(String country, String registrationId) {

    ResponseEntity<Availability> response = apiClient.getAvailability(country, registrationId);
    return response.getBody();
}

public CompanyProjection getCompany(String country, String registrationId) {

  ResponseEntity<CompanyProjection> response = apiClient.getCompany(country, registrationId);
  return response.getBody();
}

public IdentityProjection getIdentity(String country, String registrationId) {

  ResponseEntity<IdentityProjection> response = apiClient.getIdentity(country, registrationId);
  return response.getBody();
}

public ContactProjection getIdentityContact(String country, String registrationId) {

  ResponseEntity<ContactProjection> response = apiClient.getIdentityContact(country, registrationId);
  return response.getBody();
}

public ExecutiveProjection getMandataire(String country, String registrationId) {

  ResponseEntity<ExecutiveProjection> response = apiClient.getMandataire(country, registrationId);
  return response.getBody();
}

public WorkforceProjection getIdentityWorkforce(String country, String registrationId) {

  ResponseEntity<WorkforceProjection> response = apiClient.getIdentityWorkforce(country, registrationId);
  return response.getBody();
}

public RiskProjection getRisk(String country, String registrationId) {

  ResponseEntity<RiskProjection> response = apiClient.getRisk(country, registrationId);
  return response.getBody();
}

public ScoreProjection getScore(String country, String registrationId) {

  ResponseEntity<ScoreProjection> response = apiClient.getScore(country, registrationId);
  return response.getBody();
}

public ExecutiveTermsProjection getTerms(String country, String registrationId) {

  TermRequest requestParams = TermRequest.builder()
          .blockId(666)
          .ordersStartDate(Sorting.Direction.ASC)
          .positionRole(TermRequest.PositionRole.O)
          .principal(true)
          .termsState(true)
          .build();

  ResponseEntity<ExecutiveTermsProjection> response = apiClient.getTerms(country, registrationId, requestParams);
  return response.getBody();
}
//...

```
### company api
```java
//...
@Autowired
private EventsApi apiClient;

//...
public EventsProjection getEventsByCode(String country, String registrationId, String code) {

    EventRequest requestParam = EventRequest.builder()
            .filters(FiltersRequest.of("$.eventCode,"+code))
            .build();

    ResponseEntity<EventsProjection> response = apiClient.getEvents("fr", "503207896", requestParam);
    return response.getBody();
}

public EventDetailProjection getEventById(String adId) {

    ResponseEntity<EventDetailProjection> response = apiClient.getEvent(adId);
    return response.getBody();
}
```
### Executive Api Client
```java
//...
        @Autowired
        private ExecutiveApi apiClient;

//...
        public ExecutivesProjection2 getExecutivesTerms(String country, String registrationId) {
            ExecutiveRequest requestParam = ExecutiveRequest.builder()
                .blockId(1)
                .positionRole(ExecutiveRequest.PositionRole.M)
                .build();

            ResponseEntity<ExecutivesProjection2> response = apiClient.getExecutivesTerms(country, registrationId, requestParam);
            return response.getBody();
        }
```


## Security
To pass authorization headers to the provider API, [interceptors](src/main/java/fr/redfroggy/ilg/spring/boot/autoconfigure/AuthorizationInterceptor.java) are used to add these headers to the request.
See [IlgRestTemplate ](src/main/java/fr/redfroggy/ilg/spring/boot/autoconfigure/IlgRestTemplate.java) implementation

## Configuration for ILG provider

Client information must be set using environment variables

* `ILG_USERNAME`: ILG username
* `ILG_PASSWORD`: Password for ILG
* `ILG_URL`: URL for ILG webservices

or add properties into application.yml
```yaml
ilg:
  url: http://ilg.fr
  username: test-username
  password: test-password
  debugging: false
```

## Setup CI

This tool is intended to automate the releases of maven projects to maven central.  However, a lot of manual steps unfortunately must be taken to get your maven project setup so it can work properly.  Big thanks to Nathan Fischer for detailing how to do a lot of these steps in a blog post [here](http://www.debonair.io/post/maven-cd/).

If your project merely wants to take advantage of committing version numbers and creating nice release notes on your github project, you can skip steps 1-4.  In step 5, the creation of the maven artifact signing key can be skipped and the `skip-maven-deploy` flag must be set.

### Step 1: Setup an account with OSSRH

Follow [this guide](http://central.sonatype.org/pages/ossrh-guide.html#initial-setup).

### Step 2:  Make sure your pom.xml file is ready to be released

<span style="font-size:larger;">[See this example project for a sample pom.xml](https://github.com/evansiroky/maven-semantic-release-example/blob/master/pom.xml).</span>

Your maven project needs to have at least the following items in your pom.xml:

- `name` - the name of the project
- `description` - a short description
- `url` - location where users can go to get more information about the library
- `licences` - self explanatory
- `scm` - source control information
- `developers` - who worked on the project
- `distributionManagement` - the places where you want to distribute your project to

#### Plugins

Your pom.xml file needs to have the following maven plugins included:

- `maven-gpg-plugin`
- `maven-javadoc-plugin`
- `maven-source-plugin`

Your pom.xml file also needs the following sonatype plugin to automatically close and release your project from nexus.

- `nexus-staging-maven-plugin`

<span style="font-size:larger;">[See this example project for a sample pom.xml](https://github.com/evansiroky/maven-semantic-release-example/blob/master/pom.xml).</span>

### Step 3: Create a maven-settings.xml file

You can copy paste [this file](https://github.com/evansiroky/maven-semantic-release-example/blob/master/maven-settings.xml) into your repository.  The file must be called `maven-settings.xml` and must exist in the root directory of your project.

### Step 4: Create gpg keys to sign your artifact

Generate Pretty Good Privacy (PGP) keys

These steps are explained in this guide: http://central.sonatype.org/pages/working-with-pgp-signatures.html. Use gpg --list-secret-keys to find the keyid or keyname. In the guide such keyid is C6EED57A and this is what you need to find in your gpg database, and use for GPG_KEYNAME environment variable bellow.

Note: GPG2 version uses keybox (.kbx) file which contains both public and secret keys.

Distribute your public key

gpg2 --keyserver hkp://pool.sks-keyservers.net --send-keys <keyid>

Export secret and owner trust keys. These will be needed for the travis' environment variables (GPG_SECRET_KEYS and GPG_OWNERTRUST).

gpg -a --export-secret-keys <keyid> | base64 -w 0

gpg --export-ownertrust | base64 -w 0

### Step 5:  Create a .travis.yml file that'll run maven-semantic-release after success

See this [example file](https://github.com/evansiroky/maven-semantic-release-example/blob/master/.travis.yml).  In your `.travis.yml` file you'll want the following items:

#### after_success

After the success of your CI Run, you'll want to run semantic-release with the maven-semantic-release plugins.  At a minimum, you must include the following recommended configuration.  This includes overriding the plugins so that the default npm plugin is not used.

```
after_success:
  - semantic-release --prepare @conveyal/maven-semantic-release --publish @semantic-release/github,@conveyal/maven-semantic-release --verify-conditions @semantic-release/github,@conveyal/maven-semantic-release --verify-release @conveyal/maven-semantic-release
```

If you want to enable the Conveyal workflow of making commits of the release version, snapshot version and then merging master into dev, use this configuration:

```
after_success:
  - semantic-release --prepare @conveyal/maven-semantic-release --publish @semantic-release/github,@conveyal/maven-semantic-release --verify-conditions @semantic-release/github,@conveyal/maven-semantic-release --verify-release @conveyal/maven-semantic-release --use-conveyal-workflow --dev-branch=dev
```

It is also possible to skip deploying to maven central, but still incrementing the version in pom.xml by setting the flag `skip-maven-deploy`.  For example:

```
after_success:
  - semantic-release --prepare @conveyal/maven-semantic-release --publish @semantic-release/github,@conveyal/maven-semantic-release --verify-conditions @semantic-release/github,@conveyal/maven-semantic-release --verify-release @conveyal/maven-semantic-release --use-conveyal-workflow --dev-branch=dev --skip-maven-deploy
```

By default the commit message contains the appendix '[ci skip]' that skips the pipeline to run when the pom.xml is pushed. This can be disabled for snapshot and final versions if needed by providing the flag `disable-snapshot-skip-ci` or  `disable-final-skip-ci`. For example:

```
after_success:
  - semantic-release --prepare @conveyal/maven-semantic-release --publish @semantic-release/github,@conveyal/maven-semantic-release --verify-conditions @semantic-release/github,@conveyal/maven-semantic-release --verify-release @conveyal/maven-semantic-release --use-conveyal-workflow --dev-branch=dev --disable-snapshot-skip-ci --disable-final-skip-ci
```

If you use the conveyal workflow just the updated `pom.xml` will be part of the commit. To add more files to the commit (e.g. a CHANGELOG.md generated by a different plugin) you can specify those via the parameter `--additionalFilesToCommit`. This parameter accepts a list of filenames and will include them in the commit. Example:  
```
after_success:
  - semantic-release --prepare @conveyal/maven-semantic-release --publish @semantic-release/github,@conveyal/maven-semantic-release --verify-conditions @semantic-release/github,@conveyal/maven-semantic-release --verify-release @conveyal/maven-semantic-release --use-conveyal-workflow --dev-branch=dev --additionalFilesToCommit CHANGELOG.md,readme.txt
```

#### before_install

Be sure to include the import of your signing keys.  If you followed everything correctly in step 4 you should have something like the following added to your .travis.yml file:

```
before_install: |
  # only install signing keys under the same circumstances we do a mvn deploy later
  if [[ "$TRAVIS_PULL_REQUEST" = false ]] && [[ "$TRAVIS_BRANCH" = master ]]; then
    openssl aes-256-cbc -K $encrypted_### -iv $encrypted_### -in maven-artifact-signing-key.asc.enc -out maven-artifact-signing-key.asc -d
    gpg --import --batch maven-artifact-signing-key.asc
  fi
```

#### cache:

This should help speed up the installation of maven-semantic-release.  You'll want to include the m2 directory as well.

```
cache:
  directories:
    - $HOME/.m2
    - $HOME/.yarn-cache
```

Also, you'll want to install maven-semantic-release and semantic-release in a step before the build because travis caches immediately after the build.

```
before_script:
  - yarn global add @conveyal/maven-semantic-release semantic-release@15
```

### Step 6:  Add a github token to Travis

Create a Github token that will be used to make commits and create releases.  Add the token to your travis environment variables as either `GH_TOKEN` or `GITHUB_TOKEN`.  Add the following permissions to your token:

<img src="https://raw.githubusercontent.com/conveyal/maven-semantic-release/master/github-token-example.png" />

## Which `mvn` will be used

This plugin uses the `mvn` command in your `PATH`. If you have [maven-wrapper script](https://github.com/takari/maven-wrapper) at the project root directory, this plugin will use that instead.

