# Test Execution Report

## Test Environment

* Application: GatorTrader15 Marketplace
* URL: http://www.team15.csc648sfsu.com/
* Environment: AWS Deployed Application
* Browser: Google Chrome
* Tester: Mohammad Massoud Homayoun
* Test Type: Smoke Testing

## Execution Summary

| Total Test Cases | Executed | Passed | Failed | Blocked | Not Run |
| ---------------- | -------- | ------ | ------ | ------- | ------- |
| 46               | 12       | 12     | 0      | 0       | 34      |

## Pass Rate

Pass Rate = (Passed / Executed) × 100

= (12 / 12) × 100

= **100%**

## Executed Test Cases

* TC-014: Verify registered user can login with valid SFSU email
* TC-018: Verify user can logout successfully
* TC-019: Verify user can create a new listing with valid data
* TC-023: Verify newly created listing appears in marketplace
* TC-025: Verify user can edit their own listing
* TC-027: Verify user can delete their own listing
* TC-031: Verify user can contact seller from listing page
* TC-032: Verify buyer can send message to seller
* TC-033: Verify empty message cannot be sent
* TC-034: Verify seller can view received message
* TC-035: Verify user can view active conversations
* TC-036: Verify user can view past conversations

## Test Results

All executed test cases passed successfully.

No critical, high, or medium severity defects were identified during smoke testing.

## Notes

Initial smoke testing was performed on the AWS-deployed GatorTrader15 marketplace application.

A total of 12 high-priority test cases covering authentication, listing management, messaging, and conversation workflows were executed.

The remaining test cases will be covered through future regression testing and Selenium automation testing.
