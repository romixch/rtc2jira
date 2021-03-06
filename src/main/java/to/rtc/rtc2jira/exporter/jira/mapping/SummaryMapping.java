/*
 * Copyright (c) 2015 BISON Schweiz AG, All Rights Reserved.
 */
package to.rtc.rtc2jira.exporter.jira.mapping;

import java.util.Map.Entry;

import to.rtc.rtc2jira.exporter.jira.entities.Issue;
import to.rtc.rtc2jira.storage.StorageEngine;

/**
 * @author roman.schaller
 *
 */
public class SummaryMapping implements Mapping {

  @Override
  public void map(Entry<String, Object> attribute, Issue issue, StorageEngine storage) {
    String summary = (String) attribute.getValue();
    issue.getFields().setSummary(summary);
  }
}
