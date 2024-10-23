package eWallet;

import java.io.DataInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WalletManager walletManager = new WalletManager();
        DataInputStream reader = new DataInputStream(System.in);
        while(true){
            String s = reader.readLine();
            String[] str = s.split(" ");
            if(str[0].equals("CreateWallet")) {
                String name = str[1];
                double amount = Double.parseDouble(str[2]);
                walletManager.createWallet(name, amount);
            }
            if(str[0].equals("TransferMoney")){
                String payer = str[1];
                String payee = str[2];
                double amount = Double.parseDouble(str[3]);
                walletManager.transferMoney(payer, payee, amount);
            }
            if(str[0].equals("Statement")){
                String name = str[1];
                walletManager.statement(name);
            }
            if(str[0].equals("Overview")){
                walletManager.overview();
            }
            if(str[0].equals("Offer2")){
                walletManager.offer2();
            }
        }
    }
}
