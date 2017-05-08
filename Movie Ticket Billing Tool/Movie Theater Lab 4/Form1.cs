using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Movie_Ticket_Billing_Tool
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //setting variables
            string RegPriceStr = RegPriceTxtBox.Text;
            double RegPrice = Convert.ToDouble(RegPriceStr);
            double AdultPrice = 0;
            double SeniorPrice = 0;
            double KidPrice = 0;

            // NUMBER OF ADULTS
            string NumAdultStr = NumAdultTxtBox.Text;
            int NumAdult;
            if (String.IsNullOrEmpty(NumAdultStr))
            {
                NumAdult = 0;
                // sets number of ADULTS to zero if it is empty
                AdultTicketsPriceLbl.Text = "Total of adults tickets:" + AdultPrice.ToString() + "$";
            }
            else
            {
                NumAdult = Convert.ToInt32(NumAdultTxtBox.Text);
                //price for adults
                AdultPrice = (NumAdult * RegPrice);
                AdultTicketsPriceLbl.Text = "Total of adults tickets:" + AdultPrice.ToString() + "$";
            }
            
            // NUMBER OF KIDS
            string NumKidStr = NumKidsTxtBox.Text;
            int NumKids;
            if (String.IsNullOrEmpty(NumKidStr))
            {
                NumKids = 0;
                // sets number of KIDS to zero if it is empty
                KidTicketsPriceLbl.Text = "Total of kids tickets:" + KidPrice.ToString() + "$";
            }
            else
            {
                NumKids = Convert.ToInt32(NumKidsTxtBox.Text);
                //price after discount for KIDS
                KidPrice = (NumKids * RegPrice) * 0.75;
                KidTicketsPriceLbl.Text = "Total of kids tickets:" + KidPrice.ToString() + "$";
            }

            // NUMBER OF SENIOR
            string NumSeniorStr = NumSeniorsTxtBox.Text;
            int NumSenior;
            if (String.IsNullOrEmpty(NumSeniorStr))
            {
                NumSenior = 0;
                // sets number of SENIORS to zero if it is empty
                SeniorTicketsPriceLbl.Text = "Total of seniors tickets:" + SeniorPrice.ToString() + "$";
            }
            else
            {
                NumSenior = Convert.ToInt32(NumSeniorsTxtBox.Text);
                // price after discount for SENIORS
                SeniorPrice = (NumSenior * RegPrice) * 0.50;
                SeniorTicketsPriceLbl.Text = "Total of seniors tickets:" + SeniorPrice.ToString() + "$";

            }

            //input must be greater than or equal to 0
            if (NumAdult < 0)
            {
                MessageBox.Show("Please enter a positive value");
                return;
            }
            else if (NumKids < 0)
            {
                MessageBox.Show("Please enter a positive value");
                return;
            } 
            else if (NumSenior < 0)
            {
                MessageBox.Show("Please enter a positive value");
                return;
            } 
            else if (RegPrice < 0)
            {
                MessageBox.Show("Please enter a positive value");
                return;
            }


            //grandtotal price
            double GrandTotal = AdultPrice + KidPrice + SeniorPrice;
            GrandTotalLbl.Text = "Grand Total:" + GrandTotal.ToString() + "$";

            //Group discount and total price after discount
            int NumPeople = NumAdult + NumAdult + NumSenior;
            if (NumPeople < 10)
            {
                DiscountLbl.Text = "Group Discount: 0$";

                PriceDiscountedLbl.Text = "Total price after discount: " + GrandTotal.ToString() + "$";

                //tax rate
                double tax = GrandTotal * 0.15;
                TaxLbl.Text = "Tax:" + tax.ToString() + "$";

                //total price with tax
                double TotalPriceTax = GrandTotal + tax;
                TotalPriceTaxedLbl.Text = "Total price including tax: " + TotalPriceTax.ToString() + "$";
            }
            else if (NumPeople > 10 && NumPeople < 20)
            {
                double DiscountAmount = GrandTotal * 0.10;
                DiscountLbl.Text = "Group Discount:" + DiscountAmount.ToString() + "$";

                double TotalPriceDiscounted = GrandTotal - DiscountAmount;
                PriceDiscountedLbl.Text = "Total price after discount: " + TotalPriceDiscounted.ToString() + "$";

                //tax rate
                double tax = TotalPriceDiscounted * 0.15;
                TaxLbl.Text = "Tax:" + tax.ToString() + "$";

                //total price with tax
                double TotalPriceTax = TotalPriceDiscounted + tax;
                TotalPriceTaxedLbl.Text = "Total price including tax: " + TotalPriceTax.ToString() + "$";
            }
            else if (NumPeople > 20 && NumPeople < 30)
            {
                double DiscountAmount = GrandTotal * 0.20;
                DiscountLbl.Text = "Group Discount: " + DiscountAmount.ToString() + "$";

                double TotalPriceDiscounted = GrandTotal - DiscountAmount;
                PriceDiscountedLbl.Text = "Total price after discount: " + TotalPriceDiscounted.ToString() + "$";

                //tax rate
                double tax = TotalPriceDiscounted * 0.15;
                TaxLbl.Text = "Tax:" + tax.ToString() + "$";

                //total price with tax
                double TotalPriceTax = TotalPriceDiscounted + tax;
                TotalPriceTaxedLbl.Text = "Total price including tax: " + TotalPriceTax.ToString() + "$";
            }
            else if (NumPeople > 30)
            {
                double DiscountAmount = GrandTotal * 0.30;
                DiscountLbl.Text = "Group Discount: " + DiscountAmount.ToString() + "$";

                double TotalPriceDiscounted = GrandTotal - DiscountAmount;
                PriceDiscountedLbl.Text = "Total price after discount: " + TotalPriceDiscounted.ToString() + "$";

                //tax rate
                double tax = TotalPriceDiscounted * 0.15;
                TaxLbl.Text = "Tax:" + tax.ToString() + "$";

                //total price with tax
                double TotalPriceTax = TotalPriceDiscounted + tax;
                TotalPriceTaxedLbl.Text = "Total price including tax: " + TotalPriceTax.ToString() + "$";
            }
        }

        private void NumAdultTxtBox_TextChanged(object sender, EventArgs e)
        {

        }

        private void RegPriceTxtBox_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
