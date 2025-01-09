package cc.monnshot.sdk.client;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FixedSide {
  IN(0),
  OUT(1);

  private final int value;
}
