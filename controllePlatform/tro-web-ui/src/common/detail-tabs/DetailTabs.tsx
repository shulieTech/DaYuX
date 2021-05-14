/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import React, { Fragment } from 'react';
import { Tabs } from 'antd';

import styles from './index.less';

interface Props {
  defaultActiveKey?: string;
}
const DetailTabs: React.FC<Props> = props => {
  return (
    <Fragment>
      <div className={styles.detailTabs}>
        <Tabs
          animated={false}
          tabBarGutter={2}
          defaultActiveKey={props.defaultActiveKey}
        >
          {props.children}
        </Tabs>
      </div>
    </Fragment>
  );
};
export default DetailTabs;
