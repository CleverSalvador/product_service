package com.nttdata.product.app.document;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class MovementsConfig {

    private Date depositDate;
    private Date withdrawalDate;
    
}
