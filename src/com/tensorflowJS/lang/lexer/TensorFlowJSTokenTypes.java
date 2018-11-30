package com.tensorflowJS.lang.lexer;

import com.intellij.lang.javascript.JSTokenTypes;

public interface TensorFlowJSTokenTypes extends JSTokenTypes {
    TensorFlowJSTokenType ESCAPE_SEQUENCE = new TensorFlowJSTokenType("ESCAPE_SEQUENCE");
    TensorFlowJSTokenType INVALID_ESCAPE_SEQUENCE = new TensorFlowJSTokenType("INVALID_ESCAPE_SEQUENCE");
    TensorFlowJSTokenType TRACK_BY_KEYWORD = new TensorFlowJSTokenType("TRACK_BY_KEYWORD");
    TensorFlowJSTokenType ONE_TIME_BINDING = new TensorFlowJSTokenType("ONE_TIME_BINDING");
    TensorFlowJSTokenType ELVIS = new TensorFlowJSTokenType("ELVIS");// ?.
    TensorFlowJSTokenType ASSERT_NOT_NULL = new TensorFlowJSTokenType("ASSERT_NOT_NULL");// !.
    TensorFlowJSTokenType THEN = new TensorFlowJSTokenType("THEN");
    TensorFlowJSTokenType TF=new TensorFlowJSTokenType("TF");
    TensorFlowJSTokenType LAYERS=new TensorFlowJSTokenType("LAYERS");
    TensorFlowJSTokenType DENSE=new TensorFlowJSTokenType("DENSE");

}
