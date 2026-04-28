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
## Feature: Guest User Filters and Listing Details

| Test Case ID | Scenario ID | Title | Preconditions | Test Steps | Test Data | Expected Result | Priority | Status |
|---|---|---|---|---|---|---|---|---|
| TC-007 | TS-04 | Verify guest can filter listings by category successfully | Listings page is available | 1. Open homepage 2. Select a category filter 3. Apply filter | Category: Textbooks/Electronics | Only listings from the selected category are displayed | High | Not Run |
| TC-008 | TS-05 | Verify guest can filter listings by price range | Listings page is available | 1. Open homepage 2. Enter/select price range 3. Apply filter | Min: 10, Max: 100 | Only listings within the selected price range are displayed | High | Not Run |
| TC-009 | TS-06 | Verify guest can filter listings by condition | Listings page is available | 1. Open homepage 2. Select item condition 3. Apply filter | Condition: New/Used/Good | Only listings matching the selected condition are displayed | Medium | Not Run |
| TC-010 | TS-07 | Verify guest can open listing details | At least one listing exists | 1. Open homepage 2. Click a listing | Existing listing | Listing details page displays seller first name, item name, description, price, category, condition, and photos | High | Not Run |
| TC-011 | TS-08 | Verify guest can navigate to login page | Guest is on homepage | 1. Open homepage 2. Click Login/Sign In | N/A | Login page or Microsoft login option is displayed | High | Not Run |
