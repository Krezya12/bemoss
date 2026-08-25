// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.platform;

import com.intellij.facet.ui.ValidationResult;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

public abstract class DirectoryProjectGeneratorBase<T> implements DirectoryProjectGenerator<T> {
  @Override
  public @NotNull ValidationResult validate(@NotNull String baseDirPath) {
    return ValidationResult.OK;
  }

  public abstract void generateProject(@NotNull Project project,
                                       @NotNull VirtualFile baseDir,
                                       @NotNull Object settings,
                                       @NotNull Module module);
}
