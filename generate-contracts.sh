#!/bin/sh

cd ./src/test/resources/contracts

export URL_PREPROD="http://wspreprod.infolegale.fr/v2"
export URL_PROD="https://webservice.infolegale.fr/v2"
export URL=$URL_PROD

export TOKEN=$(curl -X POST "$URL/login_json" -H "accept: application/json" -H "Content-Type: application/json" -d "{ \"_username\": \"$1\", \"_password\": \"$2\"}" | jq --raw-output .token)

export AUTH_HEADER="bearer $TOKEN"
echo $AUTH_HEADER

cd ../site
curl -X GET "$URL/companies/fr/428785042/sites?number=2" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-sites.json
curl -X GET "$URL/companies/fr/428785042/sites/42878504200048" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-42878504200048-site.json
curl -X POST "$URL/companies/fr/sites/search" -H "accept: application/json" -H "Authorization: bearer $TOKEN" -H "Content-Type: multipart/form-data" -F "registrationNumber=42878504200048" | jq '.' > FR-42878504200048-search-site.json

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

cd ../kyc
curl -X GET "$URL/companies/fr/428785042/kyc/ubo" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-kyc-ubo.json
curl -X GET "$URL/companies/FR/503207896/kyc/ubo" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-kyc-ubo.json

cd ../events
curl -X GET "$URL/companies/fr/503207896/events?number=1" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-events.json
curl -X GET "$URL/event/6000574496" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-eventDetail.json

cd ../executive
curl -X GET "$URL/companies/FR/428785042/executives/terms" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-428785042-executive-terms.json

cd ../relation
curl -X GET "$URL/companies/FR/503207896/links" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-links.json
curl -X GET "$URL/companies/FR/503207896/links/shareholders" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-links-shareholders.json
curl -X GET "$URL/companies/FR/503207896/links/subsidiaries" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-links-subsidiaries.json
curl -X GET "$URL/groups/455198" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > 455198-groups.json

cd ../legalinformation
curl -X GET "$URL/companies/FR/503207896/legal" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-legal.json
curl -X GET "$URL/companies/{country}/{id}/legal/deposits" -H "accept: application/json" -H "Authorization: bearer $TOKEN" | jq '.' > FR-503207896-legal-deposits.json

