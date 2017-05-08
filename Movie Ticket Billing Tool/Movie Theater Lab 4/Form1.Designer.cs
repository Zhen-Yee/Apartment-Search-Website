namespace Movie_Ticket_Billing_Tool
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.RegPriceTxtBox = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.NumSeniorsTxtBox = new System.Windows.Forms.TextBox();
            this.NumKidsTxtBox = new System.Windows.Forms.TextBox();
            this.NumAdultTxtBox = new System.Windows.Forms.TextBox();
            this.AdultTicketsPriceLbl = new System.Windows.Forms.Label();
            this.KidTicketsPriceLbl = new System.Windows.Forms.Label();
            this.SeniorTicketsPriceLbl = new System.Windows.Forms.Label();
            this.GrandTotalLbl = new System.Windows.Forms.Label();
            this.DiscountLbl = new System.Windows.Forms.Label();
            this.PriceDiscountedLbl = new System.Windows.Forms.Label();
            this.TaxLbl = new System.Windows.Forms.Label();
            this.TotalPriceTaxedLbl = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(21, 21);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(179, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Regular Ticket Price                       $";
            // 
            // RegPriceTxtBox
            // 
            this.RegPriceTxtBox.AccessibleName = "";
            this.RegPriceTxtBox.Location = new System.Drawing.Point(197, 18);
            this.RegPriceTxtBox.Name = "RegPriceTxtBox";
            this.RegPriceTxtBox.Size = new System.Drawing.Size(100, 20);
            this.RegPriceTxtBox.TabIndex = 1;
            this.RegPriceTxtBox.Text = "10.00";
            this.RegPriceTxtBox.TextChanged += new System.EventHandler(this.RegPriceTxtBox_TextChanged);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(21, 56);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(158, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Number of adults above 14 y.o. ";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(21, 96);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(143, 13);
            this.label3.TabIndex = 3;
            this.label3.Text = "Number of kids under 14 y.o.";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(21, 134);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(160, 13);
            this.label4.TabIndex = 4;
            this.label4.Text = "Number of seniors above 65 y.o.";
            // 
            // NumSeniorsTxtBox
            // 
            this.NumSeniorsTxtBox.Location = new System.Drawing.Point(197, 131);
            this.NumSeniorsTxtBox.Name = "NumSeniorsTxtBox";
            this.NumSeniorsTxtBox.Size = new System.Drawing.Size(100, 20);
            this.NumSeniorsTxtBox.TabIndex = 5;
            // 
            // NumKidsTxtBox
            // 
            this.NumKidsTxtBox.Location = new System.Drawing.Point(197, 93);
            this.NumKidsTxtBox.Name = "NumKidsTxtBox";
            this.NumKidsTxtBox.Size = new System.Drawing.Size(100, 20);
            this.NumKidsTxtBox.TabIndex = 6;
            // 
            // NumAdultTxtBox
            // 
            this.NumAdultTxtBox.Location = new System.Drawing.Point(197, 56);
            this.NumAdultTxtBox.Name = "NumAdultTxtBox";
            this.NumAdultTxtBox.Size = new System.Drawing.Size(100, 20);
            this.NumAdultTxtBox.TabIndex = 7;
            this.NumAdultTxtBox.TextChanged += new System.EventHandler(this.NumAdultTxtBox_TextChanged);
            // 
            // AdultTicketsPriceLbl
            // 
            this.AdultTicketsPriceLbl.AutoSize = true;
            this.AdultTicketsPriceLbl.Location = new System.Drawing.Point(39, 230);
            this.AdultTicketsPriceLbl.Name = "AdultTicketsPriceLbl";
            this.AdultTicketsPriceLbl.Size = new System.Drawing.Size(114, 13);
            this.AdultTicketsPriceLbl.TabIndex = 8;
            this.AdultTicketsPriceLbl.Text = "Total of adults tickets: ";
            // 
            // KidTicketsPriceLbl
            // 
            this.KidTicketsPriceLbl.AutoSize = true;
            this.KidTicketsPriceLbl.Location = new System.Drawing.Point(39, 263);
            this.KidTicketsPriceLbl.Name = "KidTicketsPriceLbl";
            this.KidTicketsPriceLbl.Size = new System.Drawing.Size(102, 13);
            this.KidTicketsPriceLbl.TabIndex = 9;
            this.KidTicketsPriceLbl.Text = "Total of kids tickets:";
            // 
            // SeniorTicketsPriceLbl
            // 
            this.SeniorTicketsPriceLbl.AutoSize = true;
            this.SeniorTicketsPriceLbl.Location = new System.Drawing.Point(39, 294);
            this.SeniorTicketsPriceLbl.Name = "SeniorTicketsPriceLbl";
            this.SeniorTicketsPriceLbl.Size = new System.Drawing.Size(116, 13);
            this.SeniorTicketsPriceLbl.TabIndex = 10;
            this.SeniorTicketsPriceLbl.Text = "Total of seniors tickets:";
            // 
            // GrandTotalLbl
            // 
            this.GrandTotalLbl.AutoSize = true;
            this.GrandTotalLbl.Location = new System.Drawing.Point(39, 327);
            this.GrandTotalLbl.Name = "GrandTotalLbl";
            this.GrandTotalLbl.Size = new System.Drawing.Size(62, 13);
            this.GrandTotalLbl.TabIndex = 11;
            this.GrandTotalLbl.Text = "Grand total:";
            // 
            // DiscountLbl
            // 
            this.DiscountLbl.AutoSize = true;
            this.DiscountLbl.Location = new System.Drawing.Point(39, 360);
            this.DiscountLbl.Name = "DiscountLbl";
            this.DiscountLbl.Size = new System.Drawing.Size(84, 13);
            this.DiscountLbl.TabIndex = 12;
            this.DiscountLbl.Text = "Group Discount:";
            // 
            // PriceDiscountedLbl
            // 
            this.PriceDiscountedLbl.AutoSize = true;
            this.PriceDiscountedLbl.Location = new System.Drawing.Point(39, 393);
            this.PriceDiscountedLbl.Name = "PriceDiscountedLbl";
            this.PriceDiscountedLbl.Size = new System.Drawing.Size(127, 13);
            this.PriceDiscountedLbl.TabIndex = 13;
            this.PriceDiscountedLbl.Text = "Total price after discount:";
            // 
            // TaxLbl
            // 
            this.TaxLbl.AutoSize = true;
            this.TaxLbl.Location = new System.Drawing.Point(39, 425);
            this.TaxLbl.Name = "TaxLbl";
            this.TaxLbl.Size = new System.Drawing.Size(28, 13);
            this.TaxLbl.TabIndex = 14;
            this.TaxLbl.Text = "Tax:";
            // 
            // TotalPriceTaxedLbl
            // 
            this.TotalPriceTaxedLbl.AutoSize = true;
            this.TotalPriceTaxedLbl.Location = new System.Drawing.Point(39, 454);
            this.TotalPriceTaxedLbl.Name = "TotalPriceTaxedLbl";
            this.TotalPriceTaxedLbl.Size = new System.Drawing.Size(122, 13);
            this.TotalPriceTaxedLbl.TabIndex = 15;
            this.TotalPriceTaxedLbl.Text = "Total price including tax:";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(42, 179);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(338, 33);
            this.button1.TabIndex = 16;
            this.button1.Text = "Calculate";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(422, 529);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.TotalPriceTaxedLbl);
            this.Controls.Add(this.TaxLbl);
            this.Controls.Add(this.PriceDiscountedLbl);
            this.Controls.Add(this.DiscountLbl);
            this.Controls.Add(this.GrandTotalLbl);
            this.Controls.Add(this.SeniorTicketsPriceLbl);
            this.Controls.Add(this.KidTicketsPriceLbl);
            this.Controls.Add(this.AdultTicketsPriceLbl);
            this.Controls.Add(this.NumAdultTxtBox);
            this.Controls.Add(this.NumKidsTxtBox);
            this.Controls.Add(this.NumSeniorsTxtBox);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.RegPriceTxtBox);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Movie Ticket Billing Tool                 ";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox RegPriceTxtBox;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox NumSeniorsTxtBox;
        private System.Windows.Forms.TextBox NumKidsTxtBox;
        private System.Windows.Forms.TextBox NumAdultTxtBox;
        private System.Windows.Forms.Label AdultTicketsPriceLbl;
        private System.Windows.Forms.Label KidTicketsPriceLbl;
        private System.Windows.Forms.Label SeniorTicketsPriceLbl;
        private System.Windows.Forms.Label GrandTotalLbl;
        private System.Windows.Forms.Label DiscountLbl;
        private System.Windows.Forms.Label PriceDiscountedLbl;
        private System.Windows.Forms.Label TaxLbl;
        private System.Windows.Forms.Label TotalPriceTaxedLbl;
        private System.Windows.Forms.Button button1;
    }
}

