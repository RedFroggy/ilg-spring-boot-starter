#!/bin/sh

cd ./src/test/resources/contracts

export URL_PREPROD="https://wspreprod.infolegale.fr/v2"
export URL_PROD="https://webservice.infolegale.fr/v2"
export URL=$URL_PROD

export TOKEN=$(curl -X POST "$URL/login_json" -H "accept: application/json" -H "Content-Type: application/json" -d "{ \"_username\": \"$1\", \"_password\": \"$2\"}" | jq --raw-output .token)

export AUTH_HEADER="Bearer $TOKEN"
echo $AUTH_HEADER
export TAG=$3
echo tag is $TAG

if [ $TAG = 'site' ] || [ $TAG = 'all' ]
then
  echo 'call site'
  cd site
  curl -X GET "$URL/companies/fr/428785042/sites?number=2" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-sites.json
  curl -X GET "$URL/companies/fr/428785042/sites/42878504200048" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-42878504200048-site.json
  curl -X POST "$URL/companies/fr/sites/search" -H "accept: application/json" -H "Authorization: bearer $TOKEN" -H "Content-Type: multipart/form-data" -F "registrationNumber=42878504200048" | jq '.' > FR-42878504200048-search-site.json
  cd ..
fi

if [ $TAG = 'company' ] || [ $TAG = 'all' ]
then
  echo 'call company'
  cd company
  curl -X GET "$URL/companies/fr/428785042" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-company.json

  curl -X GET "$URL/companies/fr/428785042/availability" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-company-availability.json
  curl -X GET "$URL/companies/fr/428785042/identity" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-company-identity.json
  curl -X GET "$URL/companies/fr/428785042/identity/contact" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-company-identity-contact.json
  curl -X GET "$URL/companies/fr/428785042/identity/workforce" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-company-identity-workforce.json
  curl -X GET "$URL/companies/fr/428785042/mandataire" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-company-mandataire.json
  curl -X GET "$URL/companies/fr/428785042/risk" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-company-risk.json
  curl -X GET "$URL/companies/fr/428785042/score" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-company-score.json
  curl -X GET "$URL/companies/fr/503207896/terms" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-company-terms.json
  cd ..
fi

if [ $TAG = 'kyc' ] || [ $TAG = 'all' ]
then
  echo 'call kyc'
  cd kyc
  curl -X GET "$URL/companies/fr/428785042/kyc/ubo" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-kyc-ubo.json
  curl -X GET "$URL/companies/FR/503207896/kyc/ubo" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-kyc-ubo.json
  cd ..
fi

if [ $TAG = 'events' ] || [ $TAG = 'all' ]
then
  echo 'call events'
  cd events
  curl -X GET "$URL/companies/fr/503207896/events?number=1" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-events.json
  curl -X GET "$URL/event/6000574496" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-eventDetail.json
  cd ..
fi

if [ $TAG = 'executive' ] || [ $TAG = 'all' ]
then
  echo 'call executive'
  cd executive
  curl -X GET "$URL/companies/FR/428785042/executives/terms" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-executive-terms.json
  cd ..
fi

if [ $TAG = 'relation' ] || [ $TAG = 'all' ]
then
  echo 'call relation'
  cd relation
  curl -X GET "$URL/companies/FR/503207896/links" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-links.json
  curl -X GET "$URL/companies/FR/503207896/links/shareholders" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-links-shareholders.json
  curl -X GET "$URL/companies/FR/503207896/links/subsidiaries" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-links-subsidiaries.json
  curl -X GET "$URL/groups/455198" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > 455198-groups.json
  cd ..
fi

if [ $TAG = 'legalinformation' ] || [ $TAG = 'all' ]
then
  echo 'call legalinformation'
  cd legalinformation
  curl -X GET "$URL/companies/FR/503207896/legal" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-legal.json
  curl -X GET "$URL/companies/FR/503207896/legal/deposits" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-legal-deposits.json
  curl -X GET "$URL/companies/fr/503207896/legal/deposits/6901-14-B-02638-1-02" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-legal-deposit.json
  curl -X GET "$URL/companies/FR/503207896/legal/status" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-legal-status.json
  cd ..
fi

if [ $TAG = 'search' ] || [ $TAG = 'all' ]
then
  echo 'call search'
  cd search
  curl -X POST "$URL/companies/fr/autocomplete" -H "Content-Type: multipart/form-data" -H "accept: application/json" -H "Authorization: bearer $TOKEN" -F 'name=INFOLEGALE' -F 'codePostal=69003' | jq '.' > FR-INFOLEGALE-69003-autocomplete.json
  curl -X POST "$URL/companies/fr/find" -H "Content-Type: multipart/form-data" -H "accept: application/json" -H "Authorization: bearer $TOKEN" -F 'registrationId=50320789600021'  | jq '.' > FR-50320789600021-find.json
  curl -X POST "$URL/companies/fr/search/companies" -H "Content-Type: multipart/form-data" -H "accept: application/json" -H "Authorization: bearer $TOKEN" -F 'simpleSearch=50320789600021' | jq '.'  | jq '.' > FR-50320789600021-search-companies.json
  curl -X POST "$URL/companies/fr/search/executives" -H "Content-Type: multipart/form-data" -H "accept: application/json" -H "Authorization: bearer $TOKEN" -F 'dirigeantNom=PERINEL' -F 'dirigeantPrenom=FLORENT' | jq '.' > FR-FLORENT-PERINEL-search-executives.json
  curl -X POST "$URL/companies/fr/search" -H "Content-Type: multipart/form-data" -H "accept: application/json" -H "Authorization: bearer $TOKEN" -F 'simpleSearch=50320789600021' | jq '.' > FR-50320789600021-search.json
  curl -X POST "$URL/companies/fr/sites/search" -H "Content-Type: multipart/form-data" -H "accept: application/json" -H "Authorization: bearer $TOKEN" -F 'registrationNumber=50320789600021' | jq '.' > FR-50320789600021-sites-search.json
  curl -X POST "$URL/companies/fr/suggest" -H "Content-Type: multipart/form-data" -H "accept: application/json" -H "Authorization: bearer $TOKEN" -F 'name=INFOLEGALE' -F 'codePostal=69003' | jq '.' > FR-INFOLEGALE-69003-suggest.json
  cd ..
fi

if [ $TAG = 'monitoring' ] || [ $TAG = 'all' ]
then
  echo 'call monitoring'
  cd monitoring

  export PORTFOLIO="999999"
  export SIREN=503207896
  export SUBSCRIBER=999@999.fr

  curl -X GET "$URL/monitoring/alert" -H "accept: application/json" -H "Authorization: $AUTH_HEADER" | jq '.' > monitoring-alert.json
  curl -X GET "$URL/monitoring/alert/portfolio/$PORTFOLIO?sort=adId&order=ASC" -H "accept: application/json" -H "Authorization: $AUTH_HEADER" | jq '.' > monitoring-alert-portfolio-1.json
  curl -X GET "$URL/monitoring/portfolio/$PORTFOLIO/item" -H "accept: application/json" -H "Authorization: $AUTH_HEADER" | jq '.' > monitoring-portfolio-1-item.json

  curl -X GET "$URL/monitoring/targets" -H "accept: application/json" -H "Authorization: $AUTH_HEADER" | jq '.' > monitoring-targets.json
  curl -X GET "$URL/monitoring/portfolio" -H "accept: application/json" -H "Authorization: $AUTH_HEADER" | jq '.' > monitoring-portfolio.json
  curl -X GET "$URL/monitoring/portfolio/$PORTFOLIO" -H "accept: application/json" -H "Authorization: $AUTH_HEADER" | jq '.' > monitoring-portfolio-1.json
  curl -X GET "$URL/monitoring/portfolio/siren/$SIREN" -H "accept: application/json" -H "Authorization: $AUTH_HEADER" | jq '.' > monitoring-siren-1.json

  curl -X GET "$URL/monitoring/numbers?portfolioId=$PORTFOLIO" -H "accept: application/json" -H "Authorization: $AUTH_HEADER" | jq '.' > monitoring-numbers.json
  curl -X GET "$URL/monitoring/target/$SUBSCRIBER/subscriptions" -H "accept: application/json" -H "Authorization: $AUTH_HEADER" | jq '.' > monitoring-target-subscriptions.json
  cd..
fi