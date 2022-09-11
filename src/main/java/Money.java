class Money
{
    private int buttonNumber;
    private int value;
    private int amount;

    Money(int buttonNumber, int value, int amount) {
        this.buttonNumber =  buttonNumber;
        this.value = value;
        this.amount = amount;

    }
    public int getValue(){return value ;}

    public void setValue(int value) {
        this.value = value;
    }
    public int getAmount() {return amount;}
    public void setAmount(int amount) {this.amount += amount;}

    public int getButtonNumber() {
        return buttonNumber;
    }

    public void setButtonNumber(int buttonNumber) {
        this.buttonNumber = buttonNumber;
    }

}