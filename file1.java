class LoginTestCases {
    public static boolean login(String username, String password) {
        String validUsername = "admin";
        String validPassword = "password123";
        if (username == null || password == null) {
            return false;
        }
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }
        return username.equals(validUsername) && password.equals(validPassword);
    }
    public static void runTest(String testCaseName, String username, String password, boolean expectedResult) {
        boolean actualResult = login(username, password);
        if (actualResult == expectedResult) {
            System.out.println(testCaseName + " : PASSED");
        } else {
            System.out.println(testCaseName + " : FAILED");
        }
    }
    public static void main(String[] args) {
        System.out.println("LOGIN PAGE TEST CASES\n");
        // ✅ Valid Test Case
        runTest("TC1 - Valid Username and Password", "admin", "password123", true);
        // ❌ Invalid Test Cases
        runTest("TC2 - Invalid Username", "user", "password123", false);
        runTest("TC3 - Invalid Password", "admin", "pass123", false);
        runTest("TC4 - Invalid Username and Password", "user", "pass", false);
        // ⚠ Boundary / Edge Cases
        runTest("TC5 - Empty Username", "", "password123", false);
        runTest("TC6 - Empty Password", "admin", "", false);
        runTest("TC7 - Empty Username and Password", "", "", false);
        runTest("TC8 - Null Username", null, "password123", false);
        runTest("TC9 - Null Password", "admin", null, false);
        System.out.println("\nTest execution completed.");
    }
}
