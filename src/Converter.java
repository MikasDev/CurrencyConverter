public class Converter {
    private double brlToUsd = 0.18;
    private double brlToEur = 0.16;
    private double brlToGbp = 0.14;
    private double brlToJpy = 20.05;

    public double convertCurrency(double amount, String inValue, String outValue) {
        switch (inValue) {
            case "BRL":
                switch (outValue) {
                    case "USD":
                        return amount * brlToUsd;
                    case "EUR":
                        return amount * brlToEur;
                    case "GBP":
                        return amount * brlToGbp;
                    case "JPY":
                        return amount * brlToJpy;
                }
                break;
            case "USD":
                switch (outValue) {
                    case "BRL":
                        return amount / brlToUsd;
                    case "EUR":
                        return amount * (brlToEur / brlToUsd);
                    case "GBP":
                        return amount * (brlToGbp / brlToUsd);
                    case "JPY":
                        return amount * (brlToJpy / brlToUsd);
                }
                break;
            case "EUR":
                switch (outValue) {
                    case "BRL":
                        return amount / brlToEur;
                    case "USD":
                        return amount * (brlToUsd / brlToEur);
                    case "GBP":
                        return amount * (brlToGbp / brlToEur);
                    case "JPY":
                        return amount * (brlToJpy / brlToEur);
                }
                break;
            case "GBP":
                switch (outValue) {
                    case "BRL":
                        return amount / brlToGbp;
                    case "USD":
                        return amount * (brlToUsd / brlToGbp);
                    case "EUR":
                        return amount * (brlToEur / brlToGbp);
                    case "JPY":
                        return amount * (brlToJpy / brlToGbp);
                }
                break;
            case "JPY":
                switch (outValue) {
                    case "BRL":
                        return amount / brlToJpy;
                    case "USD":
                        return amount * (brlToUsd / brlToJpy);
                    case "EUR":
                        return amount * (brlToEur / brlToJpy);
                    case "GBP":
                        return amount * (brlToGbp / brlToJpy);
                }
                break;
        }
        return -1; // Moeda de entrada ou saída não suportada
    }
    public String getCurrencySymbol(String currency) {
        switch (currency) {
            case "BRL":
                return "R$";
            case "USD":
                return "$";
            case "EUR":
                return "€";
            case "GBP":
                return "£";
            case "JPY":
                return "¥";
            default:
                return "";
        }
    }
}
