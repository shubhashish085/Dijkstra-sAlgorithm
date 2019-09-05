package com.example.algorithm;

import java.sql.Timestamp;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class UomConversion {


	 private String uomOidFrom;

	 private String uomOidTo;

     private double conversionFactor;


}
