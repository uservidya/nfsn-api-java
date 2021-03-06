package cx.cad.nfsn.objects;

import cx.cad.nfsn.API;

import java.util.ArrayList;

public class Member extends APIObject {

    private static final String type = "member";


    public Member(String username, API api) {
        super(username, api, type);
    }

    //properties

    public String getEmail() {
        return null;
    }

    public String getPassword() {//this is probably not what it means
        return null;
    }

    public String getStatus() {
        return null;
    }

    public ArrayList<Account> getAccounts() {
        return null;
    }

    public ArrayList<Site> getSites() {
        return null;
    }

    //methods

    public void confirmNewEmail(String confirmationCode) {

    }

    public String getAPIKey(String password) {
        return null;
    }

    public String getInfo() {
        return null;
    }

    public void requestNewEmail(String email) {

    }

    public String summarizeAccounts() {
        return null;
    }

    public String summarizeDatabases() {
        return null;
    }

    public String summarizeDomains() {
        return null;
    }

    public String summarizeSites() {
        return null;
    }
}
