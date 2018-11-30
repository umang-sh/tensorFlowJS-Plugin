package com.tensorflowJS.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.javascript.types.JSEmbeddedContentElementType;
import com.intellij.lang.javascript.types.JSFileElementType;
import com.intellij.lexer.Lexer;
import com.intellij.psi.tree.ICompositeElementType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.tensorflowJS.lang.TensorFlowJSLanguage;
import com.tensorflowJS.psi.TensorFlowJSFilterExpression;
import com.tensorflowJS.psi.TensorFlowJSMessageFormatExpression;
import com.tensorflowJS.psi.TensorFlowJSRepeatExpression;
import com.tensorflowJS.psi.TensorFlowJSFilterExpression;
import com.tensorflowJS.psi.TensorFlowJSMessageFormatExpression;
import com.tensorflowJS.psi.TensorFlowJSRepeatExpression;
import org.jetbrains.annotations.NotNull;

/**
 * @author Dennis.Ushakov
 */
public interface TensorFlowJSElementTypes {
    IFileElementType FILE = JSFileElementType.create(TensorFlowJSLanguage.INSTANCE);
    IElementType REPEAT_EXPRESSION = new TensorFlowJSElementType("REPEAT_EXPRESSION") {
        @NotNull
        @Override
        public ASTNode createCompositeNode() {
            return new TensorFlowJSRepeatExpression(this);
        }
    };
    IElementType FOR_EXPRESSION = new TensorFlowJSElementType("REPEAT_EXPRESSION") {
        @NotNull
        @Override
        public ASTNode createCompositeNode() {
            return new TensorFlowJSRepeatExpression(this);
        }
    };
    IElementType FILTER_EXPRESSION = new TensorFlowJSElementType("FILTER_EXPRESSION") {
        @NotNull
        @Override
        public ASTNode createCompositeNode() {
            return new TensorFlowJSFilterExpression(this);
        }
    };


    IElementType MESSAGE_FORMAT_EXPRESSION_NAME = new IElementType("MESSAGE_FORMAT_EXPRESSION_NAME", TensorFlowJSLanguage.INSTANCE);
    IElementType MESSAGE_FORMAT_EXPRESSION = new TensorFlowJSElementType("MESSAGE_FORMAT_EXPRESSION") {
        @NotNull
        @Override
        public ASTNode createCompositeNode() {
            return new TensorFlowJSMessageFormatExpression(this);
        }
    };
    IElementType MESSAGE_FORMAT_MESSAGE = new IElementType("MESSAGE_FORMAT_MESSAGE", TensorFlowJSLanguage.INSTANCE);
    IElementType MESSAGE_FORMAT_OPTION = new IElementType("MESSAGE_FORMAT_OPTION", TensorFlowJSLanguage.INSTANCE);
    IElementType MESSAGE_FORMAT_SELECTION_KEYWORD = new IElementType("MESSAGE_FORMAT_SELECTION_KEYWORD", TensorFlowJSLanguage.INSTANCE);

    IElementType EMBEDDED_CONTENT = new JSEmbeddedContentElementType(TensorFlowJSLanguage.INSTANCE, "ANG_") {
        @Override
        protected Lexer createStripperLexer(Language baseLanguage) {
            return null;
        }
    };

    abstract class TensorFlowJSElementType extends IElementType implements ICompositeElementType {

        public TensorFlowJSElementType(@NotNull String debugName) {
            super(debugName,  TensorFlowJSLanguage.INSTANCE);
        }

    }
}
