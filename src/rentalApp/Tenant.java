/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalApp;

import java.util.List;

/**
 *
 * @author latua
 */
public class Tenant extends User {

    private int tenantId;
    private List<RentalContract> contracts;

    public Tenant(int tenantId, List<RentalContract> contracts, int userId, String firstName, String lastName, String email, String password) {
        super(userId, firstName, lastName, email, password);
        this.tenantId = tenantId;
        this.contracts = contracts;
    }

    public Tenant() {
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public List<RentalContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<RentalContract> contracts) {
        this.contracts = contracts;
    }

    public boolean createRentalContract() {
        return true;
    }

    public boolean terminateRentalContract() {
        return true;
    }

    @Override
    public boolean ResetPassword() {
        return super.ResetPassword();
    }

    @Override
    public boolean UpdateProfile() {
        return super.UpdateProfile();
    }

    @Override
    public boolean Login() {
        return super.Login();
    }

    @Override
    public boolean Register() {
        return super.Register();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setUserId(int userId) {
        super.setUserId(userId);
    }

    @Override
    public int getUserId() {
        return super.getUserId();
    }
}
