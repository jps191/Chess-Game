

Main
{
    public static main(String args[][])
    {
        panel.addMouseListener(new MouseAdapter() 
                {
                    @Override
                    public void mouseClicked(MouseEvent e) 
                    {
                        handleMouseClick(panel);
                    }
                });
    }
}
