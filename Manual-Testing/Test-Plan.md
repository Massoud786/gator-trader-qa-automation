# GatorTrader15 - QA Test Plan

## Objective
Validate the core functionality, usability, security, and reliability of the GatorTrader15 marketplace application deployed on AWS.

## Scope
This testing project covers:
- Guest browsing
- Search and filters
- Listing details
- User login
- Listing creation, editing, and deletion
- Messaging between buyer and seller
- Meetup scheduling and location recommendation
- Admin listing and meetup management

## Testing Types
- Functional Testing
- End-to-End Testing
- Regression Testing
- UI Testing
- API Testing
- Database Validation
- Cross-Browser Testing
- Responsive Testing
- Basic Security Testing

## Test Environment
- Application URL: http://www.team15.csc648sfsu.com/
- Environment: AWS deployed web application
- Browsers: Chrome, Safari, Edge
- Devices: Desktop and mobile view

## Tools
- Manual Testing
- Selenium WebDriver with Java
- TestNG or Cucumber
- Postman
- GitHub
- GitHub Actions or Jenkins

## Out of Scope
- Payment testing
- Native mobile app testing
- Email client or external chat service testing
- Localization testing

## Entry Criteria
- Application is deployed and accessible
- Core pages are available
- Test data is prepared
- Requirements are reviewed

## Exit Criteria
- Critical test cases pass
- Major defects are reported
- Regression suite is executed
- Test results are documented
