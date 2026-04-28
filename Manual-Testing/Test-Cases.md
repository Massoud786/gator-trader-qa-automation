# GatorTrader15 - Test Cases

## Feature: Guest User Browsing

| Test Case ID | Scenario ID | Title | Preconditions | Test Steps | Test Data | Expected Result | Priority | Status |
|---|---|---|---|---|---|---|---|---|
| TC-001 | TS-01 | Verify guest can access homepage | App is deployed and accessible | 1. Open browser 2. Navigate to http://www.team15.csc648sfsu.com/ | URL | Homepage loads successfully without requiring login | High | Not Run |
| TC-002 | TS-01 | Verify homepage displays required project disclaimer | Guest is on homepage | 1. Open homepage 2. Check top navigation/header area | Required text from NFR #18 | Exact SFSU project disclaimer is displayed | High | Not Run |
| TC-003 | TS-02 | Verify guest can view active listings | Guest is on homepage/listings page | 1. Open homepage 2. View marketplace listings | Existing active listings | Active listings are visible with item name, price, category/condition if available | High | Not Run |
| TC-004 | TS-03 | Verify guest can search listings using valid keyword | Listings exist | 1. Open homepage 2. Enter valid keyword 3. Submit search | `book` | Listings matching keyword are displayed | High | Not Run |
| TC-005 | TS-03 | Verify guest search with no matching keyword | Listings page is available | 1. Open homepage 2. Enter keyword that should not exist 3. Submit search | `zzzz12345` | User sees no results message or empty result list without app crashing | Medium | Not Run |
| TC-006 | TS-03 | Verify guest search with special characters | Listings page is available | 1. Open homepage 2. Enter special characters 3. Submit search | `@#$%^&*` | App handles input safely and does not crash | Medium | Not Run |
