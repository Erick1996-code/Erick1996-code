package com.example.Loan_Litigation.Authentication.utils.Shared;

public class UserRequestContext {
    private static ThreadLocal<String> currentUser = new InheritableThreadLocal<>();
    public static String getCurrentUser() {
        return currentUser.get();
    }
    public static void setCurrentUser(String userName) {
        currentUser.set(userName);
    }
    public static void clear() {
        currentUser.set(null);
    }
}
