package views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
    public void welcomeScreen() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the app");
        System.out.println("Press 1 to login");
        System.out.println("Press 2 to Signup");
        System.out.println("Press 0 to Exit");
        int choice = 0;
        try {
            choice = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        switch (choice) {
            case 1 -> login();
            case 2 -> signup();
            case 0 -> System.exit(0);
        }
    }

    private void signup() {
    }

    private void login() {
    }

}