package core.basesyntax.model;

public class FruitTransaction {
    private Operation type;
    private String fruit;
    private int quantity;

    public FruitTransaction(Operation type, String fruit, int quantity) {
        this.type = type;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public Operation getType() {
        return type;
    }

    public void setOperation(Operation type) {
        this.type = type;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public enum Operation {
        BALANCE("b"),
        SUPPLY("s"),
        PURCHASE("p"),
        RETURN("r");

        private final String code;

        Operation(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static Operation getByCode(String codeLetter) {
            for (Operation operationType : Operation.values()) {
                if (operationType.getCode().equals(codeLetter)) {
                    return operationType;
                }
            }
            throw new IllegalArgumentException("Unknown operation type:" + codeLetter);
        }
    }

    @Override
    public String toString() {
        return " FruitsTransaction: " + type.getCode() + " "
                + fruit
                + " "
                + quantity;
    }
}

