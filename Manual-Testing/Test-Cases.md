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
## Feature: Registered User Login

| Test Case ID | Scenario ID | Title | Preconditions | Test Steps | Test Data | Expected Result | Priority | Status |
|---|---|---|---|---|---|---|---|---|
| TC-013 | TS-08 | Verify registered user can access login page | App is deployed and accessible | 1. Open homepage<br>2. Click Login/Sign In | N/A | Microsoft/SFSU login page or login option is displayed | High | Not Run |
| TC-014 | TS-08 | Verify registered user can login with valid SFSU email | User has valid SFSU account | 1. Open homepage<br>2. Click Login/Sign In<br>3. Enter valid SFSU credentials<br>4. Submit login | Valid SFSU email/password | User is successfully logged in and redirected to homepage/dashboard | Critical | Not Run |
| TC-015 | TS-08 | Verify non-SFSU account cannot access protected features | User has non-SFSU account | 1. Open login page<br>2. Attempt login using non-SFSU account | Non-SFSU email | Login is rejected or user cannot access registered-user features | Critical | Not Run |
| TC-016 | TS-08 | Verify user cannot access protected page without login | User is not logged in | 1. Open browser<br>2. Navigate directly to protected page such as create listing | Protected page URL | User is redirected to login page or shown unauthorized message | Critical | Not Run |
| TC-017 | TS-08 | Verify user session remains active after page refresh | User is logged in | 1. Login successfully<br>2. Refresh the page | Valid session | User remains logged in after refresh | Medium | Not Run |
| TC-018 | TS-08 | Verify user can logout successfully | User is logged in | 1. Click Logout<br>2. Try accessing protected feature | N/A | User is logged out and protected features are no longer accessible | High | Not Run |
## Feature: Listing Creation (Registered User)

| Test Case ID | Scenario ID | Title | Preconditions | Test Steps | Test Data | Expected Result | Priority | Status |
|---|---|---|---|---|---|---|---|---|
| TC-019 | TS-09 | Verify user can create a new listing with valid data | User is logged in | 1. Login<br>2. Navigate to "Create Listing"<br>3. Enter all required fields<br>4. Submit | Valid item details | Listing is successfully created and visible in marketplace | Critical | Not Run |
| TC-020 | TS-10 | Verify required fields validation when creating listing | User is logged in | 1. Navigate to create listing<br>2. Leave required fields empty<br>3. Submit | Empty fields | Validation messages are displayed for required fields | High | Not Run |
| TC-021 | TS-10 | Verify listing creation with invalid price input | User is logged in | 1. Navigate to create listing<br>2. Enter invalid price (negative or text)<br>3. Submit | Price = -10 or "abc" | System rejects invalid input and shows validation error | High | Not Run |
| TC-022 | TS-10 | Verify user can upload photos when creating listing | User is logged in | 1. Navigate to create listing<br>2. Upload image file<br>3. Submit | Valid image file | Image is uploaded and displayed in listing | Medium | Not Run |
| TC-023 | TS-09 | Verify newly created listing appears in marketplace | User is logged in and creates listing | 1. Create listing<br>2. Navigate to listings page | Valid listing | Newly created listing is visible in marketplace | Critical | Not Run |
| TC-024 | TS-10 | Verify system handles large description input | User is logged in | 1. Enter very long description<br>2. Submit | Long text (e.g., 1000+ chars) | System accepts or properly limits input without crashing | Medium | Not Run |
## Feature: Listing Management (Edit & Delete)

| Test Case ID | Scenario ID | Title | Preconditions | Test Steps | Test Data | Expected Result | Priority | Status |
|---|---|---|---|---|---|---|---|---|
| TC-025 | TS-11 | Verify user can edit their own listing | User is logged in and has an existing listing | 1. Login<br>2. Navigate to user's listing<br>3. Click Edit<br>4. Update details<br>5. Save changes | Updated title/price/description | Listing is updated successfully and reflects new data | Critical | Not Run |
| TC-026 | TS-11 | Verify validation when editing listing with invalid data | User is logged in and has an existing listing | 1. Edit listing<br>2. Enter invalid data (e.g., empty title or invalid price)<br>3. Save | Invalid inputs | System shows validation errors and does not save changes | High | Not Run |
| TC-027 | TS-12 | Verify user can delete their own listing | User is logged in and has an existing listing | 1. Login<br>2. Navigate to listing<br>3. Click Delete<br>4. Confirm deletion | Existing listing | Listing is removed from marketplace | Critical | Not Run |
| TC-028 | TS-12 | Verify deleted listing is no longer visible | Listing has been deleted | 1. Delete listing<br>2. Search or browse listings | Deleted listing | Deleted listing does not appear in marketplace results | Critical | Not Run |
| TC-029 | TS-11 | Verify user cannot edit another user's listing | User is logged in | 1. Attempt to access another user's listing edit page | Another user's listing | System restricts access (error or redirect) | High | Not Run |
| TC-030 | TS-12 | Verify user cannot delete another user's listing | User is logged in | 1. Attempt to delete another user's listing | Another user's listing | System prevents deletion and shows error/unauthorized message | High | Not Run |
