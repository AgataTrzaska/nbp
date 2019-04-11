package pl.akademiakodu.nbp;

import java.util.List;

public class CurrencyModel {

    private List<NbpCurrency> rates;

    public List<NbpCurrency> getRates() {
        return rates;
    }


    public static class NbpCurrency {

        private Double bid;

        private Double ask;

        public Double getBid() {
            return bid;
        }

        public Double getAsk() {
            return ask;
        }

        @Override
        public String toString() {
            return "Exchange rate = [" +
                    "bid=" + bid +
                    ", ask=" + ask +"]";
        }
    }


}
