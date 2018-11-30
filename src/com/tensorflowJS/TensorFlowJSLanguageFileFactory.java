package com.tensorflowJS;

import com.intellij.openapi.fileTypes.FileNameMatcher;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.tensorflowJS.lang.TensorFlowJSFileType;
import org.jetbrains.annotations.NotNull;
//import org.tensorflowjs.lang.TensorFlowJSFileType;

//import org.angular2.lang.html.Angular2HtmlFileType;

/**
 * @author Umang Sharma
 */
public class TensorFlowJSLanguageFileFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(TensorFlowJSFileType.INSTANCE);
    }
}