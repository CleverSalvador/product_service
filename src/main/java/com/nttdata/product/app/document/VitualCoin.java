package com.nttdata.product.app.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "VirtualCoin")
public class VitualCoin {
    @Id
    private String id;
    private BigDecimal exchangeRate;
    private String idClient;
    private Double mounth;
    private OperationType operationType;

}
