package com.company.mmvsms.modules.shared.api;

import java.math.BigDecimal;
import java.util.Objects;

public final class Money {
  private final BigDecimal amount;
  private final String currency;

  public Money(BigDecimal amount, String currency) {
    this.amount = Objects.requireNonNull(amount, "amount");
    this.currency = Objects.requireNonNull(currency, "currency");
  }

  public BigDecimal amount() {
    return amount;
  }

  public String currency() {
    return currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Money money = (Money) o;
    return amount.equals(money.amount) && currency.equals(money.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }
}
