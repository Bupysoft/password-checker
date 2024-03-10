| №  | Test                                                                           | Status |
|:--:|:-------------------------------------------------------------------------------|:------:|
| 1  | Verify Password with Letters, Digits and Special Characters (8 symbols)        |  Pass  |
| 2  | Verify Password with Only Digits and Special Characters (>8 symbols)           |  Pass  |
| 3  | Verify Password with Letters, Digits and Special Characters (300 symbols)      |  Pass  |
| 4  | Verify Empty password                                                          |  Pass  |
| 5  | Verify Password without Special Characters (>8 symbols)                        |  Pass  |
| 6  | Verify Password without Digits (>8 symbols)                                    |  Pass  |
| 7  | Verify Short Password with Letters, Digits and Special Characters (<8 symbols) |  Pass  |

# Homework 9

### **In scope:** API testing with using Swagger 'Delete' method
**Requirements:** 

_Valid id range:_ 1-10

_API key length:_ 16 digits

### **Environment:**
* Windows 11 Pro, v23H2
* Intellij IDEA 2023.3.4 
* SDK: OpenJDK 21.0.2
* Apache Maven 4.0.0
* JUnit 5.10.2

### **Tests:**
| № | Test                                               | Expected | Status |
|:-:|:---------------------------------------------------|:--------:|:------:|
| 1 | Verify Successful delete of Order                  | Code 204 |  Pass  |
| 2 | Verify Deleting an Order without API key usage     | Code 400 |  Pass  |
| 3 | Verify Deleting an Order with wrong API key length | Code 401 |  Pass  |
| 4 | Verify Deleting an Order with invalid ID (lower)   | Code 400 |  Pass  |
| 5 | Verify Deleting an Order with invalid ID (higher)  | Code 400 |  Pass  |
| 6 | Verify Deleting an Order with letters in ID        | Code 400 |  Pass  |
| 7 | Verify Deleting an Order with empty ID             | Code 405 |  Pass  |

# Homework 10
### **Tests:**
| № | Test                                                                              | Expected | Status | Comments                                                                                                 |
|:-:|:----------------------------------------------------------------------------------|:--------:|:------:|:---------------------------------------------------------------------------------------------------------|
| 1 | Verify Successful login / correct messages                                        | Code 200 |  Pass  |                                                                                                          |
| 2 | Verify Successful login with special characters in Username / correct messages    | Code 200 |  Pass  |                                                                                                          |
| 3 | Verify Successful login with special characters in Password / correct messages    | Code 200 |  Pass  |                                                                                                          |
| 4 | Verify Successful login with special characters in both fields / correct messages | Code 200 |  Pass  |                                                                                                          |
| 5 | Verify Unsuccessful login with empty Username / correct messages                  | Code 400 |  Fail  | We receive code 500 (Internal server error) instead of code 400 (Bad Request). Needs more investigation. |
| 6 | Verify Unsuccessful login with empty Password / correct messages                  | Code 400 |  Fail  | We receive code 500 (Internal server error) instead of code 400 (Bad Request). Needs more investigation. |
| 7 | Verify Unsuccessful login with both empty fields / correct messages               | Code 400 |  Fail  | We receive code 500 (Internal server error) instead of code 400 (Bad Request). Needs more investigation. |