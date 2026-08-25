package com.bemoss.ide.wizard;

import com.intellij.ide.wizard.NewProjectWizardStepProvider;
import com.intellij.ide.wizard.NewProjectWizardStepProviderFilter;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class BeMossNewProjectWizardFilter implements com.bemoss.ide.wizard.NewProjectWizardStepProviderFilter {

  @Override
  public @NotNull List<NewProjectWizardStepProvider> filter(@NotNull List<NewProjectWizardStepProvider> providers) {
    // Профессиональный скальпель: оставляем ТОЛЬКО те провайдеры,
    // которые лежат в нашем пакете com.bemoss
    return providers.stream()
      .filter(provider -> provider.getClass().getName().startsWith("com.bemoss"))
      .collect(Collectors.collectingAndThen(Collectors.toList(), filtered -> {
        // Если вдруг мы еще ничего не зарегистрировали,
        // временно оставляем список пустым, чтобы не падать
        return filtered;
      }));
  }
}
