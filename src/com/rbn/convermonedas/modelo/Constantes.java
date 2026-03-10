package com.pollorosa.convermonedas.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Constantes {
    public final static String TEXTO_SALIR = "Salir";
    public final static String SEPARADOR = "*************************************************";
    public final static String TEXTO_BIENVENIDA = "Sea bienvenido/a al Conversor de Moneda";
    public final static String TEXTO_INGRESAR_OPCION = "Elija una opción válida:";
    public final static String TEXTO_INGRESAR_VALOR = "Ingrese el valor que deseas convertir:";
    public final static String TEXTO_RESPUESTA = "El valor INGRESAR_VALOR_BASE [INGRESAR_MONEDA_BASE] corresponde al valor final de INGRESAR_VALOR_TARGET [INGRESAR_MONEDA_TARGET]";

    public final static String TEXTO_ERROR_OPCION_NO_NUMERICA = "Opción no numérica. Elija una opción válida:";
    public final static String TEXTO_ERROR_OPCION_OUT_OF_BOUNDS = "Opción no válida. Elija una opción válida:";
    public final static String TEXTO_ERROR_VALOR_NO_NUMERICO = "Valor no numérico. Ingrese el valor que deseas convertir:";
    public final static String TEXTO_ERROR_VALOR_NEGATIVO = "Valor menor a cero. Ingrese el valor que deseas convertir:";

    public final static String API_KEY = "";
    public final static String EXCHANGERATE_EXITO = "success";
    public final static List<ExchangerateError> EXCHANGERATE_ERROR;
    static {
        List<ExchangerateError> exchangeErrorTemporal = new ArrayList<>();
        exchangeErrorTemporal.add(new ExchangerateError("unsupported-code", "We don't support the supplied currency code."));
        exchangeErrorTemporal.add(new ExchangerateError("malformed-request", "The request doesn't follow the structure."));
        exchangeErrorTemporal.add(new ExchangerateError("invalid-key", "API key is not valid."));
        exchangeErrorTemporal.add(new ExchangerateError("inactive-account", "Email address wasn't confirmed."));
        exchangeErrorTemporal.add(new ExchangerateError("quota-reached", "Your account has reached the the number of requests allowed by your plan."));
        EXCHANGERATE_ERROR = Collections.unmodifiableList(exchangeErrorTemporal);
    }
    //
}
