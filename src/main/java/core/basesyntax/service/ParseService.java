package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface ParseService {
    public List<FruitTransaction> parseFromString(List<String> transactions);
}
