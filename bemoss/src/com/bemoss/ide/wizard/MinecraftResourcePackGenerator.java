package com.bemoss.ide.wizard;

import com.intellij.platform.DirectoryProjectGeneratorBase;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MinecraftResourcePackGenerator extends DirectoryProjectGeneratorBase<Object> {
  @Override
  public @NotNull String getName() {
    return "Minecraft Resource Pack";
  }

  @Override
  public Icon getLogo() {
    // Здесь можно вернуть иконку крипера, блока или BeMoss (16x16)
    return null;
  }

  @Override
  public void generateProject(@NotNull Project project,
                              @NotNull VirtualFile baseDir,
                              @NotNull Object settings,
                              com.intellij.openapi.module.@NotNull Module module) {

  }

  @Override
  public void generateProject(@NotNull Project project, @NotNull VirtualFile baseDir, @NotNull Object settings, @NotNull Module module) {
    // Логика создания структуры папок при нажатии кнопки Create:
    // 1. Создать папку "behavior_pack"
    // 2. Создать папку "resource_pack"
    // 3. Сгенерировать базовые файлы manifest.json в обеих папках
  }
}
