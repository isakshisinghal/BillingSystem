<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.5" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Component id="jScrollPane1" alignment="0" pref="737" max="32767" attributes="0"/>
          <Group type="102" attributes="0">
              <EmptySpace max="32767" attributes="0"/>
              <Component id="jButton1" min="-2" pref="89" max="-2" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
          </Group>
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace min="-2" pref="71" max="-2" attributes="0"/>
              <Component id="jLabel1" min="-2" pref="239" max="-2" attributes="0"/>
              <EmptySpace max="32767" attributes="0"/>
              <Component id="jLabel2" min="-2" pref="170" max="-2" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" attributes="0">
                      <EmptySpace min="-2" pref="24" max="-2" attributes="0"/>
                      <Component id="jLabel1" min="-2" pref="33" max="-2" attributes="0"/>
                  </Group>
                  <Component id="jLabel2" min="-2" pref="122" max="-2" attributes="0"/>
              </Group>
              <EmptySpace max="-2" attributes="0"/>
              <Component id="jScrollPane1" min="-2" pref="466" max="-2" attributes="0"/>
              <EmptySpace pref="55" max="32767" attributes="0"/>
              <Component id="jButton1" min="-2" pref="44" max="-2" attributes="0"/>
              <EmptySpace min="-2" pref="44" max="-2" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Container class="javax.swing.JScrollPane" name="jScrollPane1">
      <AuxValues>
        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
      </AuxValues>

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
      <SubComponents>
        <Component class="javax.swing.JTable" name="jTable1">
          <Properties>
            <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
              <Table columnCount="5" rowCount="4">
                <Column editable="true" title="Title 1" type="java.lang.Object"/>
                <Column editable="true" title="Title 2" type="java.lang.Object"/>
                <Column editable="true" title="Title 3" type="java.lang.Object"/>
                <Column editable="true" title="Title 4" type="java.lang.Object"/>
                <Column editable="true" title="Title 5" type="java.lang.Object"/>
              </Table>
            </Property>
            <Property name="columnModel" type="javax.swing.table.TableColumnModel" editor="org.netbeans.modules.form.editors2.TableColumnModelEditor">
              <TableColumnModel selectionModel="0">
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
              </TableColumnModel>
            </Property>
            <Property name="tableHeader" type="javax.swing.table.JTableHeader" editor="org.netbeans.modules.form.editors2.JTableHeaderEditor">
              <TableHeader reorderingAllowed="true" resizingAllowed="true"/>
            </Property>
          </Properties>
        </Component>
      </SubComponents>
    </Container>
    <Component class="javax.swing.JButton" name="jButton1">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Tahoma" size="14" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="BACK"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton1ActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Tahoma" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="jLabel1"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel2">
      <Properties>
        <Property name="icon" type="javax.swing.Icon" editor="org.netbeans.modules.form.editors2.IconEditor">
          <Image iconType="3" name="/logo image/Supervisor-icon.png"/>
        </Property>
      </Properties>
    </Component>
  </SubComponents>
</Form>
