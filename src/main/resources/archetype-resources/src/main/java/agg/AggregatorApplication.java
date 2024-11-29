#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.agg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * AggregatorApplication TODO
 * date time: 2024/11/29 16:58
 * Copyright 2024 github.com/vencent-lu/giants-aggregator-archetype Inc. All rights reserved.
 *
 * @author vencent-lu
 * @since 1.0
 */
@SpringBootApplication
public class AggregatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AggregatorApplication.class, args);
    }

}
