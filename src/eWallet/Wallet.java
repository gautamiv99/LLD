package eWallet;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Wallet implements Comparable<Wallet> {
    private String name;
    private Double balance;
    private Long timestamp;
    private List<History> historyList;

    public Wallet(String name, double balance) {
        this.name = name;
        this.balance = balance;
        historyList = new ArrayList<>();
        this.timestamp = System.currentTimeMillis();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<History> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(List<History> historyList) {
        this.historyList = historyList;
    }

    @Override
    public int compareTo(Wallet o) {
        int size1 = this.getHistoryList().stream().filter(obj -> obj.getType() == Operation.DEBIT).collect(Collectors.toList()).size();
        int size2 = o.getHistoryList().stream().filter(obj -> obj.getType() == Operation.DEBIT).collect(Collectors.toList()).size();
        if(size1 == size2){
            if(this.balance == o.getBalance())
                return o.timestamp.compareTo(this.timestamp);
            return o.balance.compareTo(this.balance);
        }
        return size1 > size2?-1:1;
    }
}
