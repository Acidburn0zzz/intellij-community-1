/*
 * Copyright 2000-2005 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.openapi.localVcs;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.AbstractVcs;
import com.intellij.openapi.vcs.FileStatusProvider;
import com.intellij.openapi.vcs.checkin.CheckinEnvironment;

public abstract class LocalVcsServices{

  public static LocalVcsServices getInstance(Project project){
    return project.getComponent(LocalVcsServices.class);
  }

  public abstract LocalVcsItemsLocker getUpToDateRevisionProvider();
  public abstract FileStatusProvider getFileStatusProvider();
  public abstract CheckinEnvironment createCheckinEnvironment(AbstractVcs vcs);
}
