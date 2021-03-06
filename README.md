
# ILGV2 client library 
[![Build Status](https://travis-ci.org/RedFroggy/ilg-spring-boot-starter.svg?branch=master)](https://travis-ci.org/RedFroggy/ilg-spring-boot-starter) 
[![codecov](https://codecov.io/gh/RedFroggy/ilg-spring-boot-starter/branch/master/graph/badge.svg?token=XM9R6ZV9SJ)](https://codecov.io/gh/RedFroggy/ilg-spring-boot-starter)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)
[![license](https://badges.frapsoft.com/os/mit/mit.svg?v=103)](https://opensource.org/licenses/mit-license.php)

[![Maven Central](https://img.shields.io/maven-central/v/fr.redfroggy/ilg-spring-boot-starter.svg)](https://maven-badges.herokuapp.com/maven-central/fr.redfroggy/ilg-spring-boot-starter)
![GitHub Release Date](https://img.shields.io/github/release-date/RedFroggy/ilg-spring-boot-starter?style=plastic)
[![Known Vulnerabilities](https://snyk.io/test/github/RedFroggy/ilg-spring-boot-starter/badge.svg)](https://snyk.io/test/github/RedFroggy/ilg-spring-boot-starter)

Get an organisation identity thanks to ilgV2 rest api

**see ilg documentation https://webservice.infolegale.fr/v2/docs/api/**

This Library is partial but implement many of ilg's api endpoints.
Create a github issue on this repo if you want more.


## Compatibility

This library requires Java version 1.8 or higher.
This library requires spring boot 2.x .
This library is compatible with ilg rest api 2.0.8 .

## Installation (Maven)

Add the following in your `pom.xml`

``` xml
    <dependencies>
        <dependency>
          <groupId>fr.redfroggy</groupId>
          <artifactId>ilg-spring-boot-starter</artifactId>
          <version>${ilg-spring-boot-starter.version}</version>
        </dependency>
    </dependencies>
```
[![Maven Central](https://img.shields.io/maven-central/v/fr.redfroggy/ilg-spring-boot-starter.svg?label=ilg-spring-boot-starter.version)](https://maven-badges.herokuapp.com/maven-central/fr.redfroggy/ilg-spring-boot-starter)

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
### events api
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

### KYC Api Client
```java
//...
        @Autowired
        private KycComplianceApi apiClient;

        public KycUboProjection getKycUbo(String country, String registrationId) {

            ResponseEntity<KycUboProjection> response = apiClient.getKycUbo(country, registrationId);
            return response.getBody();
        }
```

### Search sites Api Client
```java
//...
        @Autowired
        private SearchApi apiClient;

        public SiteSearch searchSites(String country, String registrationId) {
            ResponseEntity<SiteSearch> searchResponse = apiClient.searchSites(country, SiteSearchRequest.builder()
                    .registrationNumber(registrationId)
                    .build(), null
            );
            return response.getBody();
        }
```

### Search companies Api Client
```java
//...
        @Autowired
        private SearchApi apiClient;

        public CompanySearchGeneric searchCompanies(String country, String registrationId) {
            ResponseEntity<CompanySearchGeneric> searchResponse = apiClient.searchCompanies("fr", CompanySearchRequestParam.builder()
                    .simpleSearch(registrationId)
                    .build(), null
            );
            return response.getBody();
        }
```

### Monitoring alerts Api Client
```java
//...
        @Autowired
        private MonitoringApi apiClient;

        public Alerts getMonitoringAlert() {
            ResponseEntity<Alerts> response = apiClient.getMonitoringAlert(
                AlertRequest.builder()
                        .entityId(777)
                        .userEmail("tes@test.fr")
                        .isPerso(1)
                        .alertMaxDate(LocalDate.of(2021, Month.FEBRUARY, 12))
                        .alertMinDate(LocalDate.of(2021, Month.FEBRUARY, 12))
                        .source(AlertSource.BOD)
                        .page(PageRequest.of(1,2))
                        .sort(MonitoringSorting.by("my-column", MonitoringSorting.Direction.ASC))
                        .build());
            return response.getBody();
        }

        public Alerts getMonitoringAlertByPortfolio(Integer portfolio) {
            ResponseEntity<Alerts> response = apiClient.getMonitoringAlertPortfolio(portfolio,
                AlertPortfolioRequest.builder()
                        .alertMaxDate(LocalDate.of(2021, Month.FEBRUARY, 12))
                        .alertMinDate(LocalDate.of(2021, Month.FEBRUARY, 12))
                        .source(AlertSource.BOD)
                        .page(PageRequest.of(1,2))
                        .build());
            return response.getBody();
        }

        public MonitoringNumbers getMonitoringNumbersByPortfolio(Integer portfolio) {
            ResponseEntity<MonitoringNumbers> response = apiClient.getMonitoringNumbers(portfolio);
            return response.getBody();
        }
```
### Monitoring portfolio Api Client
```java
//...
        @Autowired
        private MonitoringApi apiClient;

        public Portfolios getPortfolios() {
            ResponseEntity<Portfolios> response = apiClient.getMonitoringPortfolios(
                PortfolioRequest.builder()
                .entityId(777)
                .userEmail("tes@test.fr")
                .isPerso(1)
                .alertType(AlertType.JURI)
                .label("my-label")
                .updateDateMax(LocalDate.of(2021, Month.FEBRUARY, 12))
                .updateDateMin(LocalDate.of(2021, Month.FEBRUARY, 12))
                .audit(1)
                .editable(0)
                .pageable(PageableRequest.of(1,2,"my-col", MonitoringSorting.Direction.ASC))
                .build());
            return response.getBody();
        }

        public PortfolioProjection getPortfolio(Integer portfolio) {
            ResponseEntity<PortfolioProjection> response = apiClient.getMonitoringPortfolio(portfolio);
            return response.getBody();
        }
```
### Monitoring portfolio items Api Client
```java
//...
        @Autowired
        private MonitoringApi apiClient;

        public PortfolioItems getPortfolioItems(Integer portfolio, PortfolioItemRequest requestParams) {
            ResponseEntity<PortfolioItems> response = apiClient.getPortfolioItems(portfolio, requestParams);
            return response.getBody();
        }

        public void addPortfolioItem(Integer portfolio, Integer siren) {
            apiClient.addPortfolioItem(portfolio, new PortfolioItemSirenDetail(siren, "rf","100"));
        }

        public void updatePortfolioItem(Integer portfolio, Integer item, PortfolioItemDetail detail) {
            apiClient.updatePortfolioItem(portfolio, item, detail);
        }

        public void deletPortfolioItem(Integer portfolio, Integer item) {
            apiClient.deletePortfolioItem((portfolio, item);
        }

        public void deletPortfolioItems(Integer portfolio, PortfolioItemIds itemIds) {
            apiClient.deletePortfolioItems(999999, itemIds);
        }
```
### Monitoring portfolio siren Api Client
```java
//...
        @Autowired
        private MonitoringApi apiClient;

        public PortfoliosProjection2 getPortfolioSiren(Integer siren) {
            ResponseEntity<PortfoliosProjection2> response = apiClient.getPortfolioSiren(siren, PageRequest.of(0,10));
            return response.getBody();
        }

        public SirensResponseBody listPortfolioSirens(Integer siren) {
            SirensRequestBody content = new SirensRequestBody(Collections.singletonList(siren));
            ResponseEntity<SirensResponseBody> response = apiClient.listPortfolioSirens(content);
            return response.getBody();
        }

```

### Legal information Api Client
```java
//...
        @Autowired
        private LegalInformationApi apiClient;

        public Legal getLegal(String country, String siren) {
            ResponseEntity<Legal> response = apiClient.getLegal(country, siren,
            Sorting.by("dateAct", Sorting.Direction.ASC));
            return response.getBody();
        }

        public LegalDepositList getLegalDeposits(String country, String siren) {
            ResponseEntity<LegalDepositList> response = apiClient.getLegalDeposits(country, siren);
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

or set as properties into application.yml
```yaml
ilg:
  url: http://ilg.fr
  username: test-username
  password: test-password
  debugging: false
  decode404: false # default is false
```

### Decode 404
You can enable decode 404, if you not want client throw an exception when api response is 404.
When decode 404 is enabled, ilg return entity with status 404 and empty body. 
Decode404 is not enabled by default.

```yaml
ilg:
  decode404: true
```

See [IlgRestTemplateDecode404MockRestTest ](src/test/java/fr/redfroggy/ilg/IlgRestTemplateDecode404MockRestTest.java)

## Monitoring alert scheduler
With this feature, you can listen alert's events which are published when new
alerts are requested.

### Prerequiste
But first of all, you need to understand how monitoring alerts work in ILG.
You must create a portfolio and add companies to the portfolio.

Your spring app must enable Scheduling.
See https://www.baeldung.com/spring-scheduled-tasks#enable-support-for-scheduling

### Configuration
The scheduler call /monitoring/alert/portfolio/{portfolioId} endpoint to get new alerts.
And each alert is reached by the eventDetail resource returned by the /event/{id} endpoint.  
By default the scheduler request new alerts created the day before.

The scheduler must be enabled and configured:
set properties into application.yml
```yaml
ilg:
  monitoring-alert:
    enabled: true
    cron: "0 0 21 * * ?"
    portfolioId: 999999
    alert-request:
      source: JAL
      sort: "adId"
      order: ASC
      pageNumber: 50
```

### Alert Event types
9 event types inherited from AlertEventType can be published :

1. RegistrationAlertEventType
1. ModificationAlertEventType
1. CessationAlertEventType
1. TransferAlertEventType
1. LegalProceedingsAlertEventType
1. CollectiveProceedingAlertEventType
1. RiskAlertEventType
1. MiscAlertEventTypeType
1. NewsAlertEventType

The type is determined by the first event code returned in EventDetail.

### Spring events listener

By default, ApplicationEventPublisher is used as publisher, you can add spring's listeners to handle events.
```java
@Component
public class alertEventTypeListener {
    @EventListener
    public void handleAlertEventType(AlertEventType event) {
        System.out.println("Handling all alert event types.");
    }

    @EventListener
    public void handleOnlyRegistrationEvent(RegistrationAlertEventType event) {
        System.out.println("Handling only registration events.");
    }
}
```

### Overriding MonitoringAlertPublisher
The bean MonitoringAlertPublisher can be overriding.
For example, you can implements an SQS publishing
```java
@Component
public class SqsMonitoringAlertPublisher implements MonitoringAlertPublisher {

    ...
    
    @Override
    public void publishEvent(AlertEventType event) {
        SendMessageRequest send_msg_request = new SendMessageRequest()
                .withQueueUrl(queueUrl)
                .withMessageBody(event)
                .withDelaySeconds(5);
        sqs.sendMessage(send_msg_request);
    }
}
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

