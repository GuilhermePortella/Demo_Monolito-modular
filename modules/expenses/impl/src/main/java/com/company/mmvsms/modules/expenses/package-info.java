@ApplicationModule(allowedDependencies = {
    "approvals::api",
    "policies::api",
    "budgets::api",
    "attachments::api",
    "audit::api",
    "shared::api"
})
package com.company.mmvsms.modules.expenses;

import org.springframework.modulith.ApplicationModule;
