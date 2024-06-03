public class Messages {
    public void printMenu(){
        System.out.println("""
                ******************************
                Welcome to the currency converter:
                Choose what currency you would like to convert to:
                        1) USD => MXN
                        2) MXN => USD
                        3) BRL => MXN
                        4) MXN => BRL
                        5) USD => BRL
                        6) BRL => USD
                        7) Exit
                Choose an option:
                ******************************
                """);
    }
}
