/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subjects;

import Configs.Types;

/**
 *
 * @author abdo
 */
public class PersonFactory {

    public static Person getPerson(String type) {

        switch (type) {

            case Types.OWNER:

                return new Owner();

            case Types.CUSTOMER:

                return new Customer();

            case Types.CASHER:

                return new Casher();

            default:

                return new Customer();

        }

    }
}
