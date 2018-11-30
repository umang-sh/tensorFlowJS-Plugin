package com.tensorflowJS.psi;

import com.intellij.lang.javascript.psi.JSElementVisitor;


/**
 * @author Dennis.Ushakov
 */
public class TensorFlowJSElementVisitor extends JSElementVisitor {
    public void visitTensorFlowJSRepeatExpression(TensorFlowJSRepeatExpression repeatExpression) {
        visitJSExpression(repeatExpression);
    }

    public void visitMessageFormatExpression(TensorFlowJSMessageFormatExpression expression) {
        visitJSExpression(expression);
    }
}
