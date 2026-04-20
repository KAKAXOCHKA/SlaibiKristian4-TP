using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Windows.Forms;

namespace Zadanie
{
    public partial class Form1 : Form
    {
        List<TaskItem> tasks = new List<TaskItem>();
        string filePath = "tasks.txt";

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            comboBoxPriority.Items.AddRange(new string[]
            {
                "Ważne",
                "Standardowe",
                "Mało ważne"
            });

            if (File.Exists(filePath))
            {
                var lines = File.ReadAllLines(filePath);

                foreach (var line in lines)
                {
                    var parts = line.Split(';');

                    if (parts.Length == 2)
                    {
                        TaskItem task = new TaskItem
                        {
                            Name = parts[0],
                            Priority = parts[1]
                        };

                        tasks.Add(task);
                        listBoxTasks.Items.Add(task);
                    }
                }
            }
        }

        private void buttonAdd_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrWhiteSpace(textBoxName.Text))
            {
                MessageBox.Show("Wprowadź nazwę zadania!");
                return;
            }

            if (comboBoxPriority.SelectedItem == null)
            {
                MessageBox.Show("Wybierz priorytet!");
                return;
            }

            TaskItem task = new TaskItem
            {
                Name = textBoxName.Text,
                Priority = comboBoxPriority.SelectedItem.ToString()
            };

            tasks.Add(task);
            listBoxTasks.Items.Add(task);

            textBoxName.Clear();
            comboBoxPriority.SelectedIndex = -1;
        }

        private void buttonDelete_Click(object sender, EventArgs e)
        {
            if (listBoxTasks.SelectedItem is TaskItem selectedTask)
            {
                tasks.Remove(selectedTask);
                listBoxTasks.Items.Remove(selectedTask);
            }
            else
            {
                MessageBox.Show("Wybierz zadanie do usunięcia!");
            }
        }

        private void buttonSave_Click(object sender, EventArgs e)
        {
            List<string> lines = tasks
                .Select(t => $"{t.Name};{t.Priority}")
                .ToList();

            File.WriteAllLines(filePath, lines);

            MessageBox.Show("Zapisano!");
        }
    }
}
