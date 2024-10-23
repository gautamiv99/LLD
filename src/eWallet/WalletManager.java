package eWallet;

import java.util.*;
import java.util.stream.Collectors;

public class WalletManager {
    Map<String, Wallet> wallets;

    public WalletManager(){
        this.wallets = new HashMap<>();
    }

    void createWallet(String name, Double balance){
        this.wallets.put(name, new Wallet(name, balance));
    }

    void transferMoney(Wallet wallet, String payeeName, double amount, Operation operation){
        switch (operation){
            case DEBIT -> {
                wallet.setBalance(wallet.getBalance() - amount);
            }
            case CREDIT -> {
                wallet.setBalance(wallet.getBalance() + amount);
            }
        }
        wallet.getHistoryList().add(new History(payeeName, operation, amount));
    }

    void transferMoney(String payer, String payee, double amount){
        Wallet payerWallet = wallets.get(payer);
        Wallet payeeWallet = wallets.get(payee);

        transferMoney(payerWallet, payeeWallet.getName(), amount, Operation.DEBIT);
        transferMoney(payeeWallet, payerWallet.getName(), amount, Operation.CREDIT);

        offer1(payerWallet, payeeWallet);
    }

    void statement(String name){
        Wallet wallet = wallets.get(name);
        List<History> statement = wallet.getHistoryList();

        for(int i = 0; i<statement.size(); i++) {
            History transaction = statement.get(i);
            System.out.println(transaction.getName() + " " + transaction.getType() + " " + transaction.getAmount());
        }
    }

    void overview(){
        List<Wallet> walletList = new ArrayList<>(wallets.values());
        for(int i = 0; i<walletList.size(); i++){
            Wallet wallet = walletList.get(i);
            System.out.println(wallet.getName() + " " + wallet.getBalance());
        }
    }

    void offer1(Wallet payer, Wallet payee){
        if(payer.getBalance() == payee.getBalance()){
            transferMoney(payer, "Offer1",  10, Operation.CREDIT);
            transferMoney(payee, "Offer1", 10, Operation.CREDIT);
        }
    }

    void offer2(){
        List<Wallet> walletList = new ArrayList<>(wallets.values());
        Collections.sort(walletList, Wallet::compareTo);
        transferMoney(walletList.get(0), "Offer2", 10, Operation.CREDIT);
        transferMoney(walletList.get(1), "Offer2", 5, Operation.CREDIT);
        transferMoney(walletList.get(2), "Offer2", 2, Operation.CREDIT);
    }
}
