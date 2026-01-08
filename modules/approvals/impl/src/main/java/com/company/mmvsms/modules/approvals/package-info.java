@ApplicationModule(allowedDependencies = {
    "expenses::api",
    "policies::api",
    "budgets::api",
    "audit::api",
    "shared::api"
})
package com.company.mmvsms.modules.approvals;

import org.springframework.modulith.ApplicationModule;
