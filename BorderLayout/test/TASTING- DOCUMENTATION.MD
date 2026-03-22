# Testing Documentation - BorderLayout Project

## 1. Overview
This document provides the technical documentation for the Unit Tests implemented to verify the Graphical User Interface (GUI) of the BorderLayout Task.

## 2. Test Environment
* **Programming Language:** Java
* **Testing Framework:** JUnit 5 (Jupiter)
* **Components Tested:** javax.swing (JFrame, JButton, JPanel, JTextArea)

## 3. Implemented Test Cases

| Test Method | Objective | Expected Result |
| :--- | :--- | :--- |
| `testFrameCreated` | To verify the main window initialization. | Frame is created with title "BorderLayout Demo". |
| `testTitleLabel` | To check the North region title label. | Label text matches "Application Title". |
| `testWestPanelButtonsCount` | To verify the button grid in the West panel. | Panel contains exactly 3 buttons. |
| `testTextAreaExists` | To ensure the center text area is initialized. | `textArea` object is not null and ready for input. |
| `testSubmitButtonText` | To verify the action button in the South region. | Button displays the text "Submit". |

## 4. Execution Summary
The tests are designed to run automatically using the JUnit engine. 
1. **Status:** All tests are configured to pass upon correct UI initialization.
2. **Tools used:** VS Code and GitHub Desktop for version control.

---
*Prepared by: [Your Name]*
*Role: Testing Documentation Lead*