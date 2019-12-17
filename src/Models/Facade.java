/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Subjects.Male;
import Subjects.Person;
import Subjects.Table;
import javax.swing.JTable;

/**
 *
 * @author abdo
 */
public class Facade {

    private static Facade facade = null;

    private final Authentication authentication;
    private final OwnerTransactions ownerTransactions;

    private Facade() {
        authentication = new Authentication();
        ownerTransactions = new OwnerTransactions();
    }

    public boolean authenOwner(String aName, String aPassword) {

        return authentication.authenManager(aName, aPassword);
    }

    public boolean authenCasher(String aName, String aPassword) {

        return authentication.authenCasher(aName, aPassword);
    }

    public boolean authenCustomer(String aName, String aPassword) {

        return authentication.authenCustomer(aName, aPassword);

    }

    public Integer createCasher(Person aPerson) {

        return ownerTransactions.createCasher(aPerson);
    }

    public Integer createMale(Male aMale) {

        return ownerTransactions.createMale(aMale);

    }

    public Integer createTable(Table aTable) {

        return ownerTransactions.createTable(aTable);

    }

    public void getAllCashers(JTable table) {

        ownerTransactions.getAllCashers(table);

    }

    public void getAllTables(JTable table) {

        ownerTransactions.getAllTables(table);
    }

    public void getAllMales(JTable table) {

        ownerTransactions.getAllMales(table);
    }

    public Integer deleteCasher(long aCasherId) {

        return ownerTransactions.deleteCasher(aCasherId);

    }

    public Integer deleteMale(long aMaleId) {

        return ownerTransactions.deleteMale(aMaleId);

    }

    public Integer deleteTable(long aTableId) {

        return ownerTransactions.deleteTable(aTableId);

    }

    public static Facade getFacade() {

        if (Facade.facade == null) {

            facade = new Facade();

        }
        return Facade.facade;
    }

}
