package com.tensorflowJS.psi;

import com.intellij.lang.javascript.psi.impl.JSExpressionImpl;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.Ref;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.impl.source.tree.CompositeElement;
import com.intellij.psi.search.PsiElementProcessor;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.containers.ContainerUtil;
import com.tensorflowJS.parser.TensorFlowJSElementTypes;
import com.tensorflowJS.parser.TensorFlowJSMessageFormatParser;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class TensorFlowJSMessageFormatExpression extends JSExpressionImpl {
    private static final Logger LOG = Logger.getInstance("#org.angularjs.lang.psi.TensorFlowJSMessageFormatExpression");

    public TensorFlowJSMessageFormatExpression(IElementType elementType) {
        super(elementType);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof TensorFlowJSElementVisitor) {
            ((TensorFlowJSElementVisitor)visitor).visitMessageFormatExpression(this);
        } else {
            super.accept(visitor);
        }
    }

    public TensorFlowJSMessageFormatParser.ExtensionType getExtensionType() {
        final Ref<PsiElement> ref = new Ref<>();
        PsiTreeUtil.processElements(this, new PsiElementProcessor() {
            @Override
            public boolean execute(@NotNull PsiElement element) {
                final boolean isExpressionName = element.getNode().getElementType() == TensorFlowJSElementTypes.MESSAGE_FORMAT_EXPRESSION_NAME;
                ref.set(element);
                return !isExpressionName;
            }
        });
        final PsiElement typeElement = getExtensionTypeElement();
        if (typeElement == null) return null;
        try {
            return TensorFlowJSMessageFormatParser.ExtensionType.valueOf(typeElement.getText());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public PsiElement getExtensionTypeElement() {
        final Ref<PsiElement> ref = new Ref<>();
        PsiTreeUtil.processElements(this, new PsiElementProcessor() {
            @Override
            public boolean execute(@NotNull PsiElement element) {
                final boolean isExpressionName = element.getNode().getElementType() == TensorFlowJSElementTypes.MESSAGE_FORMAT_EXPRESSION_NAME;
                ref.set(element);
                return !isExpressionName;
            }
        });
        if (ref.isNull()) {
            LOG.error("TensorFlowJS message format expression does not have name");
            return null;
        }
        else {
            return ref.get();
        }
    }

    public PsiElement[] getOptions() {
        return ((CompositeElement)getNode()).getChildrenAsPsiElements(TensorFlowJSElementTypes.MESSAGE_FORMAT_OPTION, PsiElement.ARRAY_FACTORY);
    }

    public List<PsiElement> getSelectionKeywordElements() {
        if (!(getNode() instanceof CompositeElement)) return Collections.emptyList();
        final PsiElement[] selectionsKeywords = ((CompositeElement)getNode()).getChildrenAsPsiElements(
                TensorFlowJSElementTypes.MESSAGE_FORMAT_SELECTION_KEYWORD, PsiElement.ARRAY_FACTORY);
        return ContainerUtil.filter(selectionsKeywords,
                element -> element.getNode().getElementType() == TensorFlowJSElementTypes.MESSAGE_FORMAT_SELECTION_KEYWORD);
    }
}
