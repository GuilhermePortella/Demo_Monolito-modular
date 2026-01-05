package com.company.mmvsms.modules.shared.impl;

import java.time.Clock;

public final class SystemClock {
  private SystemClock() {
  }

  public static Clock utc() {
    return Clock.systemUTC();
  }
}
