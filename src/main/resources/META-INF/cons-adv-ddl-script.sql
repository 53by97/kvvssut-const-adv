CREATE DATABASE IF NOT EXISTS constadvdb;

CREATE TABLE `groups` (
  `grp_id` INT(9) NOT NULL AUTO_INCREMENT,
  `grp_name` VARCHAR(45) NOT NULL,
  `grp_desc` VARCHAR(200) NOT NULL,
  `active_ind` BOOLEAN NOT NULL DEFAULT TRUE,
  `updated_date` DATETIME,
  `created_date` DATETIME NOT NULL,
  `deleted_date` DATETIME,
  PRIMARY KEY (`grp_id`)
) ENGINE=INNODB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

CREATE TABLE `persons` (
  `per_id` INT(11) NOT NULL AUTO_INCREMENT,
  `per_name` VARCHAR(45) NOT NULL,
  `per_dob` DATE NOT NULL,
  `per_email` VARCHAR(50) NOT NULL,
  `per_addr` VARCHAR(200),
  `ovr_rev_cnt` INT(5) NOT NULL DEFAULT 0,
  `ovr_rev_scr` INT(5) NOT NULL DEFAULT 0,
  `updated_date` DATETIME,
  `created_date` DATETIME NOT NULL,
  PRIMARY KEY (`per_id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

CREATE TABLE `reviews` (
  `rev_id` INT(13) NOT NULL AUTO_INCREMENT,
  `rev_content` VARCHAR(45) NOT NULL,
  `reviewer_id` INT(11) NOT NULL,
  `reviewee_id` INT(11) NOT NULL,
  `ovr_sent_scr` INT(1) NOT NULL,
  `updated_date` DATETIME,
  `created_date` DATETIME NOT NULL,
  PRIMARY KEY (`rev_id`)
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE `person_groups` (
  `per_id` INT(11) NOT NULL,
  `grp_id` INT(9) NOT NULL,
  `active_ind` BOOLEAN NOT NULL DEFAULT TRUE,
  `removed_date` DATETIME,
  `joined_date` DATETIME NOT NULL,
  PRIMARY KEY (`per_id`, `grp_id`)
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;