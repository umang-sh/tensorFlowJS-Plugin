package com.tensorflowJS.lang.lexer;


import com.intellij.psi.tree.IElementType;
import com.tensorflowJS.lang.TensorFlowJSLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import com.intellij.lang.javascript.JSTokenTypes;

/**
 * @author Umang.Sharma
 */
public class TensorFlowJSTokenType extends IElementType {
    public TensorFlowJSTokenType(@NotNull @NonNls String debugName) {
        super(debugName, TensorFlowJSLanguage.INSTANCE);
    }
}