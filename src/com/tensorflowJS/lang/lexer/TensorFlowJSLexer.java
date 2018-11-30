package com.tensorflowJS.lang.lexer;


import com.intellij.lang.javascript.JSTokenTypes;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.MergingLexerAdapter;
import com.intellij.psi.tree.TokenSet;

public class TensorFlowJSLexer extends MergingLexerAdapter {
    public TensorFlowJSLexer() {
        super(new FlexAdapter(new _TensorFlowJSLexer(null)), TokenSet.create(JSTokenTypes.STRING_LITERAL));

    }
}
